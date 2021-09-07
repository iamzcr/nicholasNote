public class S01 {
    public static void main(String[] args) {
		Cat c  = new Cat();
        c.say();
        c.test();
    }
}
class Cat{
    //类的属性就是一种全局变量，全局变量不用赋值就能使用，因为有默认值
    //属性在定义时候，可以直接赋值
    int age = 10;
    //全局变量可以添加修饰符
    public String name = "zcr";
    public void say(){
    	//age和name是局部变量，局部变量必须要赋值才能使用
    	int age = 20;
    	String name = "test";
        System.out.println(age+name);
    }
    public void test(){
         System.out.println(age);
    }
}
