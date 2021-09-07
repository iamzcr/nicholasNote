/**
 * @author nicholas
 * @version 1.0
 */
public class Logic1 {
    public static void main(String[] args) {
        int age = 50;
        if(age >20 || age<30){
            System.out.println("true");
        }
        if(age >20 | age<30){
            System.out.println("true");
        }

        int a = 4;
        int b = 9;

        if(a>1 || ++b<50){
            System.out.println("true");
        }
        System.out.println("a="+a+";b="+b);

        int n = 4;
        int m = 9;
        if(n>1 | ++m<50){
            System.out.println("true");
        }
        System.out.println("n="+n+";m="+m);

        System.out.println(!(60>50));
        System.out.println((60>50)^(20>50));
    }
}