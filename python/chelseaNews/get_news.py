#-*- coding: utf-8 -*-
#encoding=utf-8
import MySQLdb
from pyquery import PyQuery
import time
import requests
import os
import sys 
reload(sys) 
sys.setdefaultencoding('utf-8')

def connect_db():
    db = MySQLdb.connect(host="localhost", port=3306,user="root",passwd="123456",db="football_news",charset="utf8")
    return db

def get_sina_news():
    r = requests.get("http://roll.sports.sina.com.cn/s_premierleague_all/3/index.shtml")
    r.encoding ='gb2312'
    html = r.text
    doc = PyQuery(html)
    for data in doc('.d_list_txt li'):
      title = PyQuery(data).find('a').text()
      links = PyQuery(data).find('a').attr('href')
      sourse = '新浪新闻'
      cate_id = 1
      create_time = time.ctime()
      save_data(title,cate_id,links,sourse,create_time)

def get_qq_news():
    r = requests.get("http://sports.qq.com/l/isocce/yingc/chelse/che.htm")
    html = r.text
    doc = PyQuery(html);
    for data in doc('.newslist li'):
      title = PyQuery(data).find('a').text()
      links = PyQuery(data).find('a').attr('href')
      sourse = '腾讯新闻'
      cate_id = 2
      create_time = time.ctime()
      save_data(title,cate_id,links,sourse,create_time)

def get_yi_news():
    r = requests.get("http://sports.163.com/special/y/00051F15/ycqexmore.html")
    html = r.text
    doc = PyQuery(html);
    for data in doc('.articleList li'):
      title = PyQuery(data).find('a').text()
      links = PyQuery(data).find('a').attr('href')
      sourse = '网易新闻'
      cate_id = 3
      create_time = time.ctime()
      print create_time;
      save_data(title,cate_id,links,sourse,create_time)


def save_data(title,cate_id,links,sourse,create_time):
    db = connect_db()
    cursor = db.cursor()
    sql = 'insert into fo_news (title,cate_id,links,sourse,create_time) values("%s","%s","%s","%s","%s")' % (title,cate_id,links,sourse,create_time)
    print sql
    try:
       cursor.execute(sql)
       db.commit()
       print "success"
    except:
       db.rollback()
    db.close()




