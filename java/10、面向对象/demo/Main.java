public class Main {
    public static void main(String[] args) {
    	//myCat �Ƕ�������Ҳ�ж�������
    	//new Cat()���������Ķ���
     	Cat myCat = new Cat();
     	myCat.name  = "test";
     	System.out.println(myCat.name);
     	System.out.println(myCat.age);//������Բ���ֵ���������һ������Ĭ��ֵ

     	//������
     	Cat youCat;
     	//�ٴ���
     	youCat = new Cat();
     	//youCat����myCat��ָ��ͬһ���洢�ռ䣬�����޸�youCat��name��myCat��nameҲ����Ÿı�
     	youCat = myCat;
     	youCat.name = "test2";
     	System.out.println(myCat.name);
    }
}
class Cat{
	String name;
	int age;
}