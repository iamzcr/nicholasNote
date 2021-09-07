//导入 java.util 包的 Scanner 类
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name");
        String name = scanner.next();

        System.out.println("age");
        int age = scanner.nextInt();

        System.out.println("money");
        double money = scanner.nextDouble();

        System.out.println("name"+name+";age"+age+";money"+money);
    }
}