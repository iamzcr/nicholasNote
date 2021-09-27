package com.zcr.throws01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void f() throws FileNotFoundException, NullPointerException {
        //如果调用有抛出异常的方法，在调用者里面必须处理，要不就try-catch处理，要不就抛出给上一层去处理
        f1();
    }

    //throws抛出异常，让调用该方法的调用者来处理throws FileNotFoundException 或者throws Exception
    //可以抛出多个异常throws FileNotFoundException,NullPointerException
    public static void f1() throws FileNotFoundException, NullPointerException {
        //创建一个文件流对象
        FileInputStream fileInputStream = new FileInputStream("test.log");
    }
}

class Father {
    public void method() throws RuntimeException {

    }
}

class Sun extends Father {
    //子类重写父类的方法时，对抛出异常的规定，子类重写的方法，说抛出的异常要么和父类抛出的一致，要么为父类的抛出异常类型的子类型
//    public void method() throws Exception {
    public void method() throws NullPointerException {

    }
}
