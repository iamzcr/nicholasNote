//java�Ĵ��λ��� ����
public class M05 {
    public static void main(String[] args) {
    	//mainջ�����û������test��main������ջ��Ȼ�Ƕ������ݿռ䣬�������顢������ָ��ѿռ����������(���ÿ���)�������޸���testջ��ֵ��main��Ҳ�ᱻ�ı�
    	Test t = new Test();
    	int[] arr = {1,2,3,6};
    	for(int i = 0; i<arr.length;i++){
     		System.out.println("����ǰ��"+ arr[i]);
     	}
     	t.test(arr);
     	for(int i = 0; i<arr.length;i++){
     		System.out.println("���ú�"+ arr[i]);
     	}

     	Person p = new Person();
     	p.age = 20;
		System.out.println("����ǰPerson����p��age��"+ p.age);
     	t.test01(p);
     	System.out.println("���ú�Person����p��age��"+ p.age);
    }
}
class Test{

	public void test(int[] arr){
		arr[0] = 100;
		for(int i = 0; i<arr.length;i++){
     		System.out.println("�޸ĺ�"+ arr[i]);
     	}
	}
	public void test01(Person p){
		//�����൱���ڶ������˸����󣬲�Ӱ��һ��ʼmain����Ķ�������main��p.age����10
		p = new Person();
		p.name = "test";
		p.age = 100;
		// p.age = 100;
		//����p�ÿ���֮����Ϊtest01��main�����������ռ�ջ������Ӱ�죬����main��p.age����10
		// p = null;
	}
}
class Person{
		String name; 
		int age;
}
