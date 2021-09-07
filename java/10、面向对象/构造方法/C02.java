public class C02 {
    public static void main(String[] args) {
        //new Person("zsj")的执行顺序：
        //1、先在方法区加载类信息，只加载一次
        //2、new的时候在堆区分配一个地址，
        //3、完成对象的初始化，先默认初始化，如果有显示初始化，先显示初始化，如果有自定义构造方法，替换属性值，而name是字符串，他初始化的值会存放在方法区的常量池(其他版本可能在堆区)
        //Person p2再栈区构建一个变量，指向新建对象的地址，所以实际上对象存放在堆区，栈区的p2只是一个引用
        Person p2  = new Person("zsj",10);
        Person p3  = new Person();
        System.out.println(p2.name);
    }
}

class Person{

    String name;
    int age;

    public  Person(String pName,String pAge){
        System.out.println("构造方法重载");
        name = pName;
        age = pAge;
    }
    //如果类中已经有自定义的构造方法，会覆盖默认的构造方法，如果还想要拥有默认的构造方法，需要显式调用
    public Person(){
    }
}
