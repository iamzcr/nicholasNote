//���� java.util ���� Scanner ��
import java.util.Scanner;
public class If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("����һ������");
        double a = scanner.nextDouble();
        System.out.println("������һ������");
        double b = scanner.nextDouble();
        if(a>10.0 && b<20.0){
            System.out.println(a+b);
        }
        System.out.println("�������");
    }
}