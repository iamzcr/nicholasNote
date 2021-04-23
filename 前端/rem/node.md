盒子高度等于行高可以实现垂直居中

em：是相对于父元素字体大小的一个单位
比如，父元素（html）元素设置font-size:12px，子元素设置width:2em,那么换成px元素就是2*12=24px
rem：是相对于html元素的字体大小单位
比如，根元素（html）元素设置font-size:12px，非根元素设置width:2rem,那么换成px元素就是2*12=24px

@media 可以针对不同的屏幕尺寸设置不同的样式

如果文档宽度小于 300 像素则修改背景颜色(font-size):
@media screen and (max-width: 300px) {
    html {
        font-size:14;
    }
}
@media 引用不同资源