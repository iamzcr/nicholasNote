public class S01 {
    public static void main(String[] args) {
		Cat c  = new Cat();
        c.say();
        c.test();
    }
}
class Cat{
    //������Ծ���һ��ȫ�ֱ�����ȫ�ֱ������ø�ֵ����ʹ�ã���Ϊ��Ĭ��ֵ
    //�����ڶ���ʱ�򣬿���ֱ�Ӹ�ֵ
    int age = 10;
    //ȫ�ֱ�������������η�
    public String name = "zcr";
    public void say(){
    	//age��name�Ǿֲ��������ֲ���������Ҫ��ֵ����ʹ��
    	int age = 20;
    	String name = "test";
        System.out.println(age+name);
    }
    public void test(){
         System.out.println(age);
    }
}
