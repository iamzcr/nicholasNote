public class M02 {
    public static void main(String[] args) {
    	Person p = new Person();
     	p.speak();
    }
}
class Person{

	String name;
	int age;
	//void  ��ʾû�з���ֵ
	public void speak(){
		//ͬһ��������ķ�������ֱ�ӵ���
		print();
		Cat cat= new Cat();
		cat.speak();
		System.out.println("methods speak");
	}
	public void print(){
		System.out.println("methods print");
	}
}
class Cat{

	//void  ��ʾû�з���ֵ
	public void speak(){
		System.out.println("cat speak");
	}

}