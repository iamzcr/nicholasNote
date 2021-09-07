//导入 java.util 包的 Scanner 类
import java.util.Scanner;
public class S01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符");
        char myChar = scanner.next().charAt(0);
        //switch(表达式)的数据类型，应该和case后面的常量类型保持一致，或者可以自动转换，可以相互比较的类型
        //switch(表达式)中表达是返回必须是(byte,short,int,char,enum,String)
        //case中的值必须是常量，不能是变量
        char d = 'd';
        switch(myChar){
            case 'a':
                System.out.println("a");
                break;
            case 'b':
                System.out.println("b");
                break;
            case d://编译报错，必须是常量
                System.out.println("b");
                break;
            default:
                System.out.println("no data");
                break;
        }
    }
}