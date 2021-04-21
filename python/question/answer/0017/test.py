# coding=utf-8
from xml.dom.minidom import Document
def open_txt():
	f = open ('students.txt')
	data = f.read()
	f.close()
	return data

def write_xml(data):
	doc = Document()
	root = doc.createElement("root")
	doc.appendChild(root)
	students = doc.createElement("students")
	root.appendChild(students)
	content = doc.createTextNode(data)
	students.appendChild(content)
	filename = "student.xml"
	f = open(filename, "w")
	f.write(doc.toprettyxml(indent="  "))
	f.close()

if __name__ == '__main__':
    data = open_txt()
    if data:
    	write_xml(data)