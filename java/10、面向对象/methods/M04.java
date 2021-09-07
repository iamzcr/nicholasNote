//java的传参机制，基本数据类型
public class M04 {
    public static void main(String[] args) {
    	//main栈里面的没交换，swap、main和两个栈是独立数据空间，而且基本数据类型是非引用类型(值拷贝)
    	Test t = new Test();
    	int a = 30;
    	int b = 60;
    	System.out.println("调用前：a=" + a + "b=" + b);
     	t.swap(a,b);
     	System.out.println("调用后：a=" + a + "b=" + b);
    }
}
class Test{

	public void swap(int a,int b){
		System.out.println("交换前：a=" + a + "b=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("交换后：a=" + a + "b=" + b);
	}
}
