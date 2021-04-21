# coding=utf-8

def open_txt():
	f = open ('test.txt')
	data = f.read()
	data = list(data)
	f.close()
	return data

def count_str(data):
	temp = []
	num = 0
	for key in data:
	    if key is 'k':
	    	num += 1
	return num


if __name__ == '__main__':
    data = open_txt()
    if data:
    	num = count_str(data)
    	print num