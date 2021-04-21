#-*- coding: utf-8 -*-
#encoding=utf-8
import xlrd
import matplotlib.pyplot as plt 
def open_xls():
	#打开excel
	data = xlrd.open_workbook('phone.xls')
	#根据名字拿到excel的某个表
	table = data.sheet_by_name('test')
	return table

def write_png(table):
	#行数
	nrows = table.nrows
	#列数
	ncols = table.ncols
	#迭代
	six_list = []
	out_six_list = []
	big_list = []
	for rownum in range(1,nrows):
		row = table.row_values(rownum)
		if row[5] <= 60:
			six_list.append(row[5])
		if (row[5] <= 300) and (row[5] > 60):
			out_six_list.append(row[5])
		if (row[5] > 300):
			big_list.append(row[5])
	plt.title(u"通话时长记录分析")
	plt.xlabel(u"通话时长")
	plt.ylabel(u"记录数")
	plt.xticks((0,1,2),(u"1分钟以下",u"1分钟到5分钟",u"5分钟以上"))
	plt.ylim(ymax=60, ymin=0)
	plt.bar(left = (0,1,2),height = (len(six_list),len(out_six_list),len(big_list)),width = 0.2)
	plt.show()
	print "有%s个通话记录在60秒以下".decode('UTF-8').encode('GBK') % len(six_list)
	print "有%s个通话记录在1分钟到5分钟".decode('UTF-8').encode('GBK') % len(out_six_list)
	print "有%s个通话记录在5分钟以上".decode('UTF-8').encode('GBK') % len(big_list)

if __name__ == '__main__':
    table = open_xls()
    if table:
    	write_png(table)

