 #-*- coding: utf-8 -*-
#encoding=utf-8
import pymongo
from bson import ObjectId
from flask import Flask, request, g, redirect, url_for, render_template
import time
app = Flask(__name__)

def mongo_conn():
	connection=pymongo.MongoClient('127.0.0.1',27001)  
	db=connection.message
	return db

@app.route('/')
def index():
	temp_list = []
	db = mongo_conn()
	collection=db.msg  
	msg_list = collection.find()
	for data in msg_list:
		temp_list.append(data) 
	print temp_list
	return render_template('index.html',temp_list=temp_list)

@app.route('/add_msg',methods=['GET', 'POST'])
def add_msg():
	if request.method == 'POST':
		username = request.form.get('username','default value')
		content = request.form.get('content','default value')
		add_time = time.asctime( time.localtime(time.time()) )
		data = {'username':username,'content':content,'add_time':add_time}
		db = mongo_conn()
		collection=db.msg
		collection.insert(data)
	return redirect(url_for('index'))  

@app.route('/del_msg',methods=['GET', 'POST'])
def del_msg():
	msg_id = None
	msg_id = request.args.get('msg_id')
	if msg_id is not None:
		db = mongo_conn()
		collection=db.msg
		collection.remove({"_id":ObjectId(msg_id)})
		return redirect(url_for('index'))  
if __name__ == '__main__':
    app.debug = True
    app.run() 