//导入 java.util 包的 Scanner 类
import java.util.Scanner;
public class If03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个分数：");
        int sal = scanner.nextInt();
        if(sal == 100){
            System.out.println("perfect");
        }else if (sal<100 && sal>=80) {
            System.out.println("common");
        }else{
            System.out.println("error");
        }

    }
}