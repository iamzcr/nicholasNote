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
    //���췽������������ɶ���ĳ�ʼ��������дvoid�ؼ���,
    public  Person(String pName,int pAge){
        System.out.println("���ù��췽������ɶ������Եĳ�ʼ��");
    	age = pAge;
    	name = pName;
    }
    public  Person(String pName){
        System.out.println("���췽������");
        name = pName;
    }
}
