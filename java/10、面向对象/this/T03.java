public class T03 {
    public static void main(String[] args) {
		Person p1  = new Person("zcr",10);
		Person p2  = new Person("test",10);
		boolean flag = p1.compareTo(p1);
		if(flag){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
    }
}

class Person{
	String name;
	int age;
    public  Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(Person p){
    	// if (this.name.equals(p.name) && this.age == p.age) {
    	// 	return true;
    	// }else{
    	// 	return false;
    	// }
    	return this == p;
    }
}
