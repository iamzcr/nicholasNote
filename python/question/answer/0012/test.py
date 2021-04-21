#-*- coding: utf-8 -*-
#encoding=utf-8
import os
import re
def open_html():
	data = []
	f = open ('test.txt')
	data = f.read().splitlines()
	f.close()
	return data
def get_content(data,word):
	'''
	try:
	 	data.index(word)
	 	result = 'Freedom'
	except:
		result = 'Human Rights'
	'''
	result = 'Human Rights'
	for x in data:
		res =  re.findall(x, word)
		if res:
			sub = word.replace(x,"**")
			result = sub
	return result
if __name__ == '__main__':
	data = open_html()
	while True:
		word = raw_input("> ")
		word = get_content(data,word)
		print word