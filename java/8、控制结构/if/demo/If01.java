//���� java.util ���� Scanner ��
import java.util.Scanner;
public class If01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������䣺");
        int age = scanner.nextInt();
        if(age>18){
            System.out.println("�������18");
        }else{
            System.out.println("�������ڵ���18");
        }
    }
}