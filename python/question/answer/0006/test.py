#-*- coding: utf-8 -*-
#encoding=utf-8
import os
import re
def get_filepaths(directory):
    file_paths = []
    for root, directories, files in os.walk(directory):
        for filename in files:
            filepath = os.path.join(root, filename)
            file_paths.append(filepath)

    return file_paths
def change_size(files):
	num = 0
	for new_file in files:
		f = open (new_file)
		data = f.read()
		res =  re.findall(r"love", data)
		num += len(res)
	print "love is %s" % num


if __name__ == '__main__':
	path = 'txt'
	files = get_filepaths(path)
	if files:
		change_size(files)