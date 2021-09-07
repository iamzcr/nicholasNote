//导入 java.util 包的 Scanner 类
import java.util.Scanner;
public class If04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个分数：");
        int sal = scanner.nextInt();
        if(sal > 80){
            System.out.println("输入性别");
            //字符串转字符charAt
            char sex = scanner.next().charAt(0);
            if(sex == '男'){
                System.out.println("男");
            }else{
                System.out.println("女");
            }
        }else{
            System.out.println("error");
        }

    }
}