//hashCode������ʵ�ʵ�ַ������ͨ��ʵ�ʵ�ַת���ɵ�һ������
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

    //this��ʾ��ǰ�����ڶ������棬ָ�����Լ������������������
    public  Person(String name,int age){
    	//��ǰ���������name
    	this.name = name;
    	this.age = age;
    }

    public void info(){
        System.out.println("name:" + this.name + ";age:" + this.age + "hashCode:" + this.hashCode());
    }
}
