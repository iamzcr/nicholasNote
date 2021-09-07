//导入 java.util 包的 Scanner 类
import java.util.Scanner;
public class If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数：");
        double a = scanner.nextDouble();
        System.out.println("再输入一个数：");
        double b = scanner.nextDouble();
        if(a>10.0 && b<20.0){
            System.out.println(a+b);
        }
        System.out.println("程序继续");
    }
}