//hashCode并不是实际地址，而是通过实际地址转换成的一个整数
public class T01 {
    public static void main(String[] args) {
		Person p1  = new Person("zcr",10);
        System.out.println("hashCode:"+ p1.hashCode());
		p1.info();
        Person p2  = new Person("zcj",20);
        System.out.println("hashCode:"+ p2.hashCode());
        p2.info();
    }
}

class Person{

    String name;
    int age;

    //this表示当前对象，在堆区里面，指向他自己，解决变量命名问题
    public  Person(String name,int age){
    	//当前对象的属性name
    	this.name = name;
    	this.age = age;
    }

    public void info(){
        System.out.println("name:" + this.name + ";age:" + this.age + "hashCode:" + this.hashCode());
    }
}
