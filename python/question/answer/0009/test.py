#-*- coding: utf-8 -*-
#encoding=utf-8
import os
# import re
from bs4 import BeautifulSoup
def open_html():
	f = open ('test.html')
	data = f.read()
	f.close()
	return data
def get_content(data):
	# res =  re.findall(r'<a.*>(.*?)</a>', data)
	# print res
	soup = BeautifulSoup(data)
	print(soup.find_all('a'))
	for link in soup.find_all('a'):
	    print(link.get('href'))
if __name__ == '__main__':
	data = open_html()
	if data:
		get_content(data)