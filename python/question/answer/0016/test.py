# coding=utf-8
import xlwt

def open_txt():
	f = open ('test.txt')
	data = f.read()
	data = eval(data)
	f.close()
	return data

def write_xls(data):
	wbk = xlwt.Workbook()
	sheet = wbk.add_sheet('Sheet1')   
	row = 0
	for k in data:
	    sheet.write(row, 0, k[0])
	    sheet.write(row, 1, k[1])
	    sheet.write(row, 2, k[2])
	    row += 1
	wbk.save('result.xls')

if __name__ == '__main__':
    data = open_txt()
    if data:
    	write_xls(data)
