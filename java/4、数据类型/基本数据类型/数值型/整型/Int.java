/**
 * @author nicholas
 * @version 1.0
 */
public class Int {
    public static void main(String[] args) {
        int a = 3;//00000000 00000000 00000000 00000011
        long b = 3L;//00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000011
        byte c = 3; //00000011
        short d = 3;//0000000000000011
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}