public class M01 {
    public static void main(String[] args) {
    	//在main栈执行	Person p = new Person()，会在堆里面创建一个对象
     	Person p = new Person();
     	//int sum = p.getSum(10,10);之后会在栈区再开一个空间栈，当getSum返回后，该空间栈销毁
     	int sum = p.getSum(10,10);
     	System.out.println("sum="+sum);

     	p.speak();
     	p.cal01();
     	p.cal02(10);
     	
    }
}
class Person{

	String name;
	int age;
	//void  表示没有返回值
	public void speak(){
		System.out.println("methods speak");
	}
	public void cal01(){
		int sum = 0;
		for(int i = 1;i<100;i++){
			sum+=i;
		}
		System.out.println("sum="+sum);
	}
	public void cal02(int num){
		int sum = 0;
		for(int i = 1;i<num;i++){
			sum+=i;
		}
		System.out.println("sum="+sum);
	}
	//int  返回int值
	public int getSum(int a,int b){
		int sum = a+b;
		return sum;
	}
}