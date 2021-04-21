#-*- coding: utf-8 -*-
#encoding=utf-8
from flask import Flask,render_template,request,url_for,session,redirect,flash
from datetime import datetime
import os
# import get_news
from flask.ext.script import Manager
from flask.ext.bootstrap import Bootstrap 
from flask.ext.moment import Moment
from flask.ext.sqlalchemy import SQLAlchemy

app = Flask(__name__)
from sae.const import (MYSQL_HOST, MYSQL_HOST_S,
    MYSQL_PORT, MYSQL_USER, MYSQL_PASS, MYSQL_DB
)

app.config['SECRET_KEY'] = 'hard to guess string'

app.config['SQLALCHEMY_DATABASE_URI'] = 'mysql://%s:%s@%s:%s/%s' % (MYSQL_USER, MYSQL_PASS, MYSQL_HOST, MYSQL_PORT, MYSQL_DB)

app.config['SQLALCHEMY_COMMIT_ON_TEARDOWN'] = True

manager = Manager(app)
bootstrap = Bootstrap(app)
db = SQLAlchemy(app)
moment = Moment(app)

class News(db.Model):
    __tablename__ = 'fo_news'
    id = db.Column(db.BigInteger, primary_key=True)
    title = db.Column(db.String(255), unique=True)
    cate_id = db.Column(db.String(64), unique=True)
    links = db.Column(db.String(255), unique=True)
    sourse = db.Column(db.String(64), unique=True)
    create_time = db.Column(db.BigInteger, unique=True)

    def __repr__(self):
        return '<Role %r>' % self.title
class Category(db.Model):
    __tablename__ = 'fo_category'
    id = db.Column(db.BigInteger, primary_key=True)
    name = db.Column(db.String(64), unique=True)
    slug = db.Column(db.String(32), unique=True)
    create_time = db.Column(db.BigInteger, unique=True)
    def __repr__(self):
        return '<Role %r>' % self.name

def get_category():
    category_list = Category.query.order_by(Category.create_time.desc()).all()
    return category_list
def get_news_list(category_id):
    if category_id is None:
        news_list = News.query.order_by(News.create_time.desc()).all()
    else:
        news_list = News.query.filter(News.cate_id == category_id).order_by(News.create_time.desc()).all()
    return news_list

@app.errorhandler(404)
def page_not_found(e):
    return render_template('404.html'), 404

@app.errorhandler(500)
def internal_server_error(e):
    return render_template('500.html'), 500

@app.route('/news/', methods=['GET', 'POST'])
def news():
    category_id = None
    category_id = int(request.args.get('category_id'))
    news_list = get_news_list(category_id)
    category_list = get_category()
    return render_template('news.html',news_list=news_list,category_list=category_list)

@app.route('/', methods=['GET', 'POST'])
def index():
    # get_news.get_qq_news()
    category_list = get_category()
    news_list = get_news_list(category_id = None)
    return render_template('index.html',category_list=category_list,news_list = news_list)