public class M02 {
    public static void main(String[] args) {
    	Person p = new Person();
     	p.speak();
    }
}
class Person{

	String name;
	int age;
	//void  表示没有返回值
	public void speak(){
		//同一个类里面的方法可以直接调用
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

	//void  表示没有返回值
	public void speak(){
		System.out.println("cat speak");
	}

}