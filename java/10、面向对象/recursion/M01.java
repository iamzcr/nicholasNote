//�ݹ�
//��ִ��main������ʱ�򣬿���һ��ջ�ռ䣬����t.test(4)����
//������test����������һ��ջ�ռ䣬��ʱ4>2��������������test(4 - 1)��������ʱ��ջ����ֵҲ����nΪ4
//������test(4 - 1)����������������ջ������ʱ3>2��������������test(3 - 1)��������ʱ��ջ����ֵҲ����nΪ3
//������test(3 - 1)����������������ջ����2>2����������,���ڵ���test(2 - 1)��������ʱ��ջ����ֵҲ����nΪ2
//�����ٿ���ջ�ռ��ˣ������ᰴ�շ���֮�����ִ��ʣ�µ���䣬�������Ľ����2,3,4
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

	//�׳�
	public int factorial(int n){
		if(n == 1){
			return 1;
		}else{
			return factorial(n - 1) * n;
		}
		
	}
}
