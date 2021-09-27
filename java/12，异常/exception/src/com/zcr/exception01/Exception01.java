package com.zcr.exception01;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {

            Person person = new Person();
            person = null;
            person.test();
            //如果程序员认为一段代码可能会出现问题或者异常，可以使用try-catch异常处理机制解决，保证程序的健壮性
            int res = num1 / num2;
            System.out.println(res);
            //可以单独捕获异常之类的异常，比如空指针，但是这种异常要放在最前面
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            //如果没发生异常，catch不执行
            //当异常发生的时候，系统将异常封装成Exception对象，传递给catch
//            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
            //不管try代码块是否有异常发生，使用要执行finally里面的代码块
            //一般用于资源的关闭，例如文件，数据库，网络的关闭

        }
        System.out.println("程序继续执行");
    }
}

class Person {
    public void test() {
        //可以不抛出异常，必须执行某个业务逻辑
        try {
            System.out.println("Person test");
        } finally {
            System.out.println("Person finally");
        }
    }
}
