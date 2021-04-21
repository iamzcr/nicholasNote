<?php

/**
 *图片处理类
 */
class Image {


    /**
     * 水印位置标识 右上
     */
    const RIGHTTOP = 'rt';
    /**
     * 水印位置标识 右下
     */
    const RIGHTBOTTOM = 'rb';
    /**
     * 水印位置标识 左下
     */
    const LEFTBOTTOM = 'lb';
    /**
     * 水印位置标识 左上
     */
    const LEFTTOP = 'lt';

    protected
        $image,
        $image_type;

    function __construct()
    {
    }

    public function load($filename)
    {
        $image_info = getimagesize($filename);
        $this->image_type = $image_info[2];
        if ($this->image_type == IMAGETYPE_JPEG) {
            $this->image = imagecreatefromjpeg($filename);
        } elseif ($this->image_type == IMAGETYPE_GIF) {
            $this->image = imagecreatefromgif($filename);
        } elseif ($this->image_type == IMAGETYPE_PNG) {
            $this->image = imagecreatefrompng($filename);
        }
    }

    public function available() {
        return !empty($this->image);
    }

    public function save($filename, $image_type = IMAGETYPE_JPEG, $compression = 75, $permissions = null)
    {
        if ($image_type == IMAGETYPE_JPEG) {
            imagejpeg($this->image, $filename, $compression);
        } elseif ($image_type == IMAGETYPE_GIF) {
            imagegif($this->image, $filename);
        } elseif ($image_type == IMAGETYPE_PNG) {
            imagepng($this->image, $filename);
        }
        if ($permissions != null) {
            chmod($filename, $permissions);
        }
    }

    public function output($image_type = IMAGETYPE_JPEG)
    {
        if ($image_type == IMAGETYPE_JPEG) {
            imagejpeg($this->image);
        } elseif ($image_type == IMAGETYPE_GIF) {
            imagegif($this->image);
        } elseif ($image_type == IMAGETYPE_PNG) {
            imagepng($this->image);
        }
    }

    public function getWidth()
    {
        return imagesx($this->image);
    }

    public function getHeight()
    {
        return imagesy($this->image);
    }

    public function resizeToHeight($height)
    {
        $ratio = $height / $this->getHeight();
        $width = $this->getWidth() * $ratio;
        $this->resize($width, $height);
    }

    public function resizeToWidth($width)
    {
        $ratio = $width / $this->getWidth();
        $height = $this->getheight() * $ratio;
        $this->resize($width, $height);
    }

    public function scale($scale)
    {
        $width = $this->getWidth() * $scale / 100;
        $height = $this->getheight() * $scale / 100;
        $this->resize($width, $height);
    }

    public function resize($width, $height)
    {
        $new_image = imagecreatetruecolor($width, $height);
        imagecopyresampled($new_image, $this->image, 0, 0, 0, 0, $width, $height, $this->getWidth(), $this->getHeight());
        imagedestroy($this->image);
        $this->image = $new_image;
    }

    public function hex2rgb($colour) {
        if ($colour [0] == '#') {
            $colour = substr ( $colour, 1 );
        }
        if (strlen ( $colour ) == 6) {
            list ( $r, $g, $b ) = array ($colour [0] . $colour [1], $colour [2] . $colour [3], $colour [4] . $colour [5] );
        } elseif (strlen ( $colour ) == 3) {
            list ( $r, $g, $b ) = array ($colour [0] . $colour [0], $colour [1] . $colour [1], $colour [2] . $colour [2] );
        } else {
            return false;
        }
        $r = hexdec ( $r );
        $g = hexdec ( $g );
        $b = hexdec ( $b );
        return array ('red' => $r, 'green' => $g, 'blue' => $b );
    }

    public function fill($width, $height, $color = '#FFFFFF') {
        $o_w = $this->getWidth();
        $o_h = $this->getHeight();
        $o_ratio = $o_w / $o_h;
        $ratio = $width / $height;
        $d_x = 0;
        $d_y = 0;

        if ($o_ratio > $ratio) {
            $d_w = $width;
            $d_h = $width / $o_ratio;
            $d_y = ($height - $d_h) / 2;
        } else {
            $d_h = $height;
            $d_w = $height * $o_ratio;
            $d_x = ($width - $d_w) / 2;
        }

        $new_image = imagecreatetruecolor($width, $height);
        $color_info = $this->hex2rgb($color);
        $color = imagecolorallocate($new_image, $color_info['red'], $color_info['green'], $color_info['blue']);
        imagefill($new_image, 0, 0, $color);
        imagecopyresampled($new_image, $this->image, $d_x, $d_y, 0, 0, $d_w, $d_h, $this->getWidth(), $this->getHeight());
        imagedestroy($this->image);
        $this->image = $new_image;
    }

    public function crop($width, $height) {
        $o_w = $this->getWidth();
        $o_h = $this->getHeight();
        $o_ratio = $o_w / $o_h;
        $ratio = $width / $height;
        $s_x = 0;
        $s_y = 0;

        if ($o_ratio > $ratio) {
            $s_w = $o_h * $ratio;
            $s_h = $o_h;
            $s_x = ($o_w - $s_w) / 2;
            $s_y = 0;
        } else {
            $s_h = $o_w / $ratio;
            $s_w = $o_w;
            $s_y = ($o_h - $s_h) / 2;
            $s_x = 0;
        }

        $new_image = imagecreatetruecolor($width, $height);
        imagecopyresampled($new_image, $this->image, 0, 0, $s_x, $s_y, $width, $height, $s_w, $s_h);
        imagedestroy($this->image);
        $this->image = $new_image;
    }

    /**
     * 返回image的图片类型标识
     * @return mixed
     */
    public function get_image_type() {
        return $this->image_type;
    }

    /**
     * 通过image的exif信息获取重力信息
     * @param $file_path image的物理路径
     * @return int
     */
    public static function check_orientation($file_path) {
        if (!function_exists('exif_read_data')) {
            return 0;
        }
        $exif = exif_read_data($file_path);
        if (isset($exif['Orientation'])) {
            return $exif['Orientation'];
        }
        if (isset($exif['IFD0']) && isset($exif['IFD0']['Orientation'])) {
            return $exif['IFD0']['Orientation'];
        }

        return 0;
    }

    /**
     * 根据重力位置旋转图象
     * @param $orientation 通过exif获取的垂直信息
     */
    public function fix_rotate($orientation) {
        // Fix Orientation
        $new_image = $this->image;

        switch ($orientation) {
            case 3:
                $new_image = imagerotate($this->image, 180, 0);
                imagedestroy($this->image);
                break;
            case 6:
                $new_image = imagerotate($this->image, -90, 0);
                imagedestroy($this->image);
                break;
            case 8:
                $new_image = imagerotate($this->image, 90, 0);
                imagedestroy($this->image);
                break;
        }

        $this->image = $new_image;
    }

    /**
     * 释放image资源
     */
    public function unload() {
        imagedestroy($this->image);
    }

    /**
     * 添加图片水印
     * @param Image $watermark 水印Image对象
     * @param string $position 位置标识，见本类常量
     * @param float $alpha 透明度
     */
    public function watermarkimg(Image $watermark, $position = self::RIGHTTOP, $alpha = 0.9) {
        if (!($watermark instanceof Image)) {
            $new_image = new static();
            $new_image->load($watermark);
        }



        $o_w = $this->getWidth();
        $o_h = $this->getHeight();
        $p_x = 0;
        $p_y = 0;
        $s_w = $new_image->getWidth();
        $s_h = $new_image->getHeight();
        $scale = $o_w / 9 / $s_w * 100;

        $new_image->scale($scale);

        $s_w = $new_image->getWidth();
        $s_h = $new_image->getHeight();

        switch($position) {
            case self::LEFTTOP:
                $p_x = 10;
                $p_y = 10;
                break;
            case self::LEFTBOTTOM:
                $p_x = 10;
                $p_y = $o_h - $s_h - 10;
                break;
            case self::RIGHTBOTTOM:
                $p_x = $o_w - $s_w - 10;
                $p_y = $o_h - $s_h - 10;
                break;
            case self::RIGHTTOP:
                $p_x = $o_w - $s_w - 10;
                $p_y = 10;
                break;
        }

        $watermark = $new_image->get_res();

        imagecopymerge($this->image, $watermark, $p_x , $p_y , 0, 0, $s_w, $s_h , $alpha*100);
    }

    /**
     * 添加文字水印
     * @param $text 水印文字
     * @param string $font ttf字体完整物理路径
     * @param string $position  位置标识，见本类常量
     * @param string $color 文字颜色
     * @param int $font_size 文字大小
     * @param float $alpha 透明度
     */
    public function watermarktext($text, $font = '1.ttf', $position = self::RIGHTBOTTOM, $color = '#FF00FF', $font_size = 22, $alpha = 0.6) {
        $o_w = $this->getWidth();
        $o_h = $this->getHeight();
        $p_x = 0;
        $p_y = 0;



        $color_info_shadow = $this->hex2rgb('#FFFFFF');
        $_color = imagecolorallocatealpha ($this->image, $color_info_shadow['red'], $color_info_shadow['green'], $color_info_shadow['blue'], (1-$alpha) * 127);

        $color_info = $this->hex2rgb($color);
        $color = imagecolorallocatealpha ($this->image, $color_info['red'], $color_info['green'], $color_info['blue'], (1-$alpha) * 127);

        $new_image = imagecreatetruecolor($o_w, $o_h);
        list($bottomleft_x, $bottomleft_y, $bottomright_x, $bottomright_y,  $topright_x, $topright_y, $topleft_x, $topleft_y) = imagettftext($new_image, $font_size, 0, $p_x, $p_y, $color, $font, $text);
        imagedestroy($new_image);

        switch($position) {
            case self::LEFTTOP:
                $p_x = 10;
                $p_y = $font_size + 10;
                break;
            case self::LEFTBOTTOM:
                $p_x = 10;
                $p_y = $o_h - 10;
                break;
            case self::RIGHTBOTTOM:
                $p_x = $o_w - $topright_x - 10;
                $p_y = $o_h - 10;
                break;
            case self::RIGHTTOP:
                $p_x = $o_w - $topright_x - 10;
                $p_y = $font_size + 10;
                break;
        }

        imagettftext($this->image, $font_size, 0, $p_x + 1, $p_y + 1, $_color, $font, $text);
        imagettftext($this->image, $font_size, 0, $p_x, $p_y, $color, $font, $text);
    }
}
