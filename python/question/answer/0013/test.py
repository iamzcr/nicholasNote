#-*- coding: utf-8 -*-
#encoding=utf-8
import requests
from BeautifulSoup import BeautifulSoup
if __name__ == '__main__':	
	r = requests.get('http://roll.sports.sina.com.cn/s_premierleague_all/3/index.shtml')
	r.encoding ='gb2312'
	html = r.text
	soup = BeautifulSoup(html)
	liResult = soup.findAll('li')
	f = open("test.txt",'w')
	for x in liResult:
		f.write((x.text + "\n").encode('utf-8'))

	f.close()