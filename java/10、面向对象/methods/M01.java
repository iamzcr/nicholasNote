public class M01 {
    public static void main(String[] args) {
    	//��mainջִ��	Person p = new Person()�����ڶ����洴��һ������
     	Person p = new Person();
     	//int sum = p.getSum(10,10);֮�����ջ���ٿ�һ���ռ�ջ����getSum���غ󣬸ÿռ�ջ����
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
	//void  ��ʾû�з���ֵ
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
	//int  ����intֵ
	public int getSum(int a,int b){
		int sum = a+b;
		return sum;
	}
}