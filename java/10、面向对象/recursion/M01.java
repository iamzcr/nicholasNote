//递归
//当执行main方法的时候，开辟一个栈空间，调用t.test(4)方法
//当调用test方法，开辟一个栈空间，此时4>2条件成立，调用test(4 - 1)方法，此时该栈区的值也就是n为4
//当调用test(4 - 1)方法，继续开辟新栈区，此时3>2条件成立，调用test(3 - 1)方法，此时该栈区的值也就是n为3
//当调用test(3 - 1)方法，继续开辟新栈区，2>2条件不成立,不在调用test(2 - 1)方法，此时该栈区的值也就是n为2
//当不再开辟栈空间了，函数会按照返回之后才能执行剩下的语句，所以最后的结果是2,3,4
public class M01 {
    public static void main(String[] args) {
		Test t = new Test();
		//t.test(4);
		int res = t.factorial(4);
		System.out.println("res=" + res);
    }
}

class Test{

	public void test(int n){
		if(n > 2){
			test(n - 1);
		}
		System.out.println("n=" + n);
		
	}

	//阶乘
	public int factorial(int n){
		if(n == 1){
			return 1;
		}else{
			return factorial(n - 1) * n;
		}
		
	}
}
