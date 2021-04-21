#-*- coding: utf-8 -*-
#encoding=utf-8
import os
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
	if word in data:
		result = 'Freedom'
	else:
		result = 'Human Rights'
	return result
if __name__ == '__main__':
	data = open_html()
	while True:
		word = raw_input("> ")
		word = get_content(data,word)
		print word