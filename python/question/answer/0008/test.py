#-*- coding: utf-8 -*-
#encoding=utf-8
import os
from bs4 import BeautifulSoup
def open_html():
	f = open ('test.html')
	data = f.read()
	f.close()
	return data
def get_content(data):
	soup = BeautifulSoup(data)
	print(soup.get_text())


if __name__ == '__main__':
	data = open_html()
	if data:
		get_content(data)