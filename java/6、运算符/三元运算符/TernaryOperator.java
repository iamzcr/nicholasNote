/**
 * @author nicholas
 * @version 1.0
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int result = a > b ? a++ : b--;
        /*
            a>b false
            result = b;b=b-1
         */
        System.out.println("b="+b);
        System.out.println("result="+result);

        //error 数据类型不匹配
        //int result = a > b ? 1.1 : 2.1;
    }
}