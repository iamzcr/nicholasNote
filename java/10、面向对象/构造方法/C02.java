public class C02 {
    public static void main(String[] args) {
        //new Person("zsj")��ִ��˳��
        //1�����ڷ�������������Ϣ��ֻ����һ��
        //2��new��ʱ���ڶ�������һ����ַ��
        //3����ɶ���ĳ�ʼ������Ĭ�ϳ�ʼ�����������ʾ��ʼ��������ʾ��ʼ����������Զ��幹�췽�����滻����ֵ����name���ַ���������ʼ����ֵ�����ڷ������ĳ�����(�����汾�����ڶ���)
        //Person p2��ջ������һ��������ָ���½�����ĵ�ַ������ʵ���϶������ڶ�����ջ����p2ֻ��һ������
        Person p2  = new Person("zsj",10);
        Person p3  = new Person();
        System.out.println(p2.name);
    }
}

class Person{

    String name;
    int age;

    public  Person(String pName,String pAge){
        System.out.println("���췽������");
        name = pName;
        age = pAge;
    }
    //��������Ѿ����Զ���Ĺ��췽�����Ḳ��Ĭ�ϵĹ��췽�����������Ҫӵ��Ĭ�ϵĹ��췽������Ҫ��ʽ����
    public Person(){
    }
}
