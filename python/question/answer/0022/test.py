#-*- coding: utf-8 -*-
#encoding=utf-8
#iphone6
import os
from PIL import Image
def get_filepaths(directory):
    file_paths = []
    for root, directories, files in os.walk(directory):
        for filename in files:
            filepath = os.path.join(root, filename)
            file_paths.append(filepath)

    return file_paths
def change_size(files):
	c_w, c_h = (480, 640)
	for new_file in files:
		try:
			im = Image.open(new_file)
			w, h = im.size
			if w > c_w or h > c_h:
				im.thumbnail((c_w, c_h), Image.ANTIALIAS)#裁剪
				im.save(new_file)
				print 'ok'
		except IOError:
			print "cannot create thumbnail for '%s'" % new_file

if __name__ == '__main__':
	path = 'images'
	files = get_filepaths(path)
	if files:
		change_size(files)