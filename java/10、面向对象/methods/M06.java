//克隆一个对象
public class M06 {
    public static void main(String[] args) {
    	Person p = new Person();
    	p.name = "test";
		p.age = 15;
		Test t = new Test();
		Person p1 = t.clonePerson(p);
		System.out.println("p.age="+ p.age+"p.name="+ p.name);
		System.out.println("p1.age="+ p1.age+"p1.name="+ p1.name);
		System.out.println(p1 == p);
    }
}
class Person{
	String name;
	int age;
}
class Test{

	public Person clonePerson(Person p){
		Person p1 = new Person();
		p1.name = p.name;
		p1.age = p.age;
		return p1;
	}
}
