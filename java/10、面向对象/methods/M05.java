//java的传参机制 数组
public class M05 {
    public static void main(String[] args) {
    	//main栈里面的没交换，test、main和两个栈虽然是独立数据空间，但是数组、对象是指向堆空间的引用类型(引用拷贝)，所以修改了test栈的值，main的也会被改变
    	Test t = new Test();
    	int[] arr = {1,2,3,6};
    	for(int i = 0; i<arr.length;i++){
     		System.out.println("调用前："+ arr[i]);
     	}
     	t.test(arr);
     	for(int i = 0; i<arr.length;i++){
     		System.out.println("调用后："+ arr[i]);
     	}

     	Person p = new Person();
     	p.age = 20;
		System.out.println("调用前Person对象p的age："+ p.age);
     	t.test01(p);
     	System.out.println("调用后Person对象p的age："+ p.age);
    }
}
class Test{

	public void test(int[] arr){
		arr[0] = 100;
		for(int i = 0; i<arr.length;i++){
     		System.out.println("修改后："+ arr[i]);
     	}
	}
	public void test01(Person p){
		//这里相当于在堆新增了个对象，不影响一开始main里面的对象，所以main的p.age还是10
		p = new Person();
		p.name = "test";
		p.age = 100;
		// p.age = 100;
		//当把p置空了之后，因为test01和main的两个独立空间栈，互不影响，所以main的p.age还是10
		// p = null;
	}
}
class Person{
		String name; 
		int age;
}
