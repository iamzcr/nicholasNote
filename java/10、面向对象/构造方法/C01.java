public class C01 {
    public static void main(String[] args) {
		Person p1  = new Person("zcr",10);
        System.out.println(p1.name);
        Person p2  = new Person("zsj");
        System.out.println(p2.name);
    }
}

class Person{

    String name;
    int age;
    //构造方法的作用是完成对象的初始化，不能写void关键词,
    public  Person(String pName,int pAge){
        System.out.println("调用构造方法，完成对象属性的初始化");
    	age = pAge;
    	name = pName;
    }
    public  Person(String pName){
        System.out.println("构造方法重载");
        name = pName;
    }
}
