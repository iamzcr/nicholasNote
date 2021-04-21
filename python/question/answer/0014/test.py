# coding=utf-8
import xlwt

def open_txt():
	f = open ('student.txt')
	data = f.read()
	data = eval(data)
	f.close()
	return data

def write_xls(data):
	wbk = xlwt.Workbook()
	sheet = wbk.add_sheet('Sheet1')   
	row = 0
	for k, v in data.items():
	    sheet.write(row, 0, k)
	    sheet.write(row, 1, v[0])
	    sheet.write(row, 2, v[1])
	    sheet.write(row, 3, v[2])
	    sheet.write(row, 4, v[3])
	    row += 1
	wbk.save('result.xls')

if __name__ == '__main__':
    data = open_txt()
    if data:
    	write_xls(data)
