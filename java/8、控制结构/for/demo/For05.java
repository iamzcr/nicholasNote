public class For06 {
    public static void main(String[] args) {
        for(int i = 1;i < 10;i++){
            String str = "";
            for(int j = 1;j <= i;j++){
                str += i+" * "+ j + " = " + (i*j)+" ";
            }
            System.out.println(str);
        }
    }
}