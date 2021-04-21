# coding=utf-8
from xml.dom.minidom import Document
def open_txt():
	f = open ('numbers.txt')
	data = f.read()
	f.close()
	return data

def write_xml(data):
	doc = Document()
	root = doc.createElement("root")
	doc.appendChild(root)
	numbers = doc.createElement("numbers")
	root.appendChild(numbers)
	content = doc.createTextNode(data)
	numbers.appendChild(content)
	filename = "numbers.xml"
	f = open(filename, "w")
	f.write(doc.toprettyxml(indent="  "))
	f.close()

if __name__ == '__main__':
    data = open_txt()
    if data:
    	write_xml(data)