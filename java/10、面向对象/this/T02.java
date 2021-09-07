public class T02 {
    public static void main(String[] args) {
		Person p1  = new Person();
		p1.test1();
    }
}

class Person{

    public  Person(){
        this("name");
        System.out.println("显示构造器:");
    }

    public  Person(String name){
        System.out.println("自定义构造器:");
    }

    public void test(){
        System.out.println("test 方法:");
    }

    public void test1(){
    	 System.out.println("test1 方法:");
    	 this.test();
    }
}
