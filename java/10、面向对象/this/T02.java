public class T02 {
    public static void main(String[] args) {
		Person p1  = new Person();
		p1.test1();
    }
}

class Person{

    public  Person(){
        this("name");
        System.out.println("��ʾ������:");
    }

    public  Person(String name){
        System.out.println("�Զ��幹����:");
    }

    public void test(){
        System.out.println("test ����:");
    }

    public void test1(){
    	 System.out.println("test1 ����:");
    	 this.test();
    }
}
