/**
 * @author nicholas
 * @version 1.0
 */
public class Cute {
    public static void main(String[] args) {
        int n = 1;
        n++;
        ++n;
        System.out.println(n);

        int i = 1;
        System.out.println(i);
        int k = ++i; //i=i+1;k=i
        System.out.println(k);
        int j = i++; //j=i;i=i+1
        System.out.println(j);
        System.out.println(i);

        System.out.println(10/4);

        System.out.println(10.0/4);

        double d = 10/4;
        System.out.println(d);

        System.out.println(10%3);
        System.out.println(-10%3);//a%b = a-a/b*b = -10 - (-10)/3*3
        System.out.println(10%-3);//a%b = a-a/b*b = 10 - (10)/(-3)*(-3)
        System.out.println(-10%-3);

        int num = 1;
        num = num++; //temp = num; num = num+1; num = temp;
        System.out.println("num="+num);

        int num1 = 1;
        num1 = ++num1; //num1 = num1+1;temp = num1;  num1 = temp;
        System.out.println("num1="+num1);
    }
}