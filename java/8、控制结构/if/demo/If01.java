//导入 java.util 包的 Scanner 类
import java.util.Scanner;
public class If01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入年龄：");
        int age = scanner.nextInt();
        if(age>18){
            System.out.println("年龄大于18");
        }else{
            System.out.println("年龄少于等于18");
        }
    }
}