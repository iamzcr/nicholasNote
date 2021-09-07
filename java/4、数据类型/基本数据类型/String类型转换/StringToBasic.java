/**
 * @author nicholas
 * @version 1.0
 */
public class StringToBasic {
    public static void main(String[] args) {
        int a = 111;
        String str= a+"";     
        System.out.println(str);

        String str1= "456";
        int b = Integer.parseInt(str1);
        System.out.println(b);

        boolean bool = Boolean.parseBoolean("true");
        System.out.println(bool);

        String charStr = "1234";
        System.out.println(charStr.charAt(1));

    }
}