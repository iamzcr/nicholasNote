//copy array
public class T06 {
    public static void main(String[] args) {
    	//new Test()��ʶ����������������ʹ�ú󣬾Ͳ���ʹ��
		new Test().count1();
		Test test = new Test();
		test.count2();
		test.count2();
    }
}

class Test{
	int count = 9;
    public void count1(){
		count = 10;
		System.out.println("count=" + count);
	}
	public void count2(){
		System.out.println("count=" + count++);
	}
}
