# coding=utf-8
from xml.dom.minidom import Document
def open_txt():
	f = open ('citys.txt')
	data = f.read()
	f.close()
	return data

def write_xml(data):
	doc = Document()
	root = doc.createElement("root")
	doc.appendChild(root)
	citys = doc.createElement("citys")
	root.appendChild(citys)
	content = doc.createTextNode(data)
	citys.appendChild(content)
	filename = "citys.xml"
	f = open(filename, "w")
	f.write(doc.toprettyxml(indent="  "))
	f.close()

if __name__ == '__main__':
    data = open_txt()
    if data:
    	write_xml(data)