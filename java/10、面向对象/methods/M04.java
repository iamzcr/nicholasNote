//java�Ĵ��λ��ƣ�������������
public class M04 {
    public static void main(String[] args) {
    	//mainջ�����û������swap��main������ջ�Ƕ������ݿռ䣬���һ������������Ƿ���������(ֵ����)
    	Test t = new Test();
    	int a = 30;
    	int b = 60;
    	System.out.println("����ǰ��a=" + a + "b=" + b);
     	t.swap(a,b);
     	System.out.println("���ú�a=" + a + "b=" + b);
    }
}
class Test{

	public void swap(int a,int b){
		System.out.println("����ǰ��a=" + a + "b=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("������a=" + a + "b=" + b);
	}
}
