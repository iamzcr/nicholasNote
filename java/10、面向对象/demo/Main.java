public class Main {
    public static void main(String[] args) {
    	//myCat 是对象名，也叫对象引用
    	//new Cat()才是真正的对象
     	Cat myCat = new Cat();
     	myCat.name  = "test";
     	System.out.println(myCat.name);
     	System.out.println(myCat.age);//如果属性不赋值，则和数组一样，有默认值

     	//先声明
     	Cat youCat;
     	//再创建
     	youCat = new Cat();
     	//youCat引用myCat，指向同一个存储空间，所以修改youCat的name，myCat的name也会跟着改变
     	youCat = myCat;
     	youCat.name = "test2";
     	System.out.println(myCat.name);
    }
}
class Cat{
	String name;
	int age;
}