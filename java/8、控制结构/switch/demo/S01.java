//���� java.util ���� Scanner ��
import java.util.Scanner;
public class S01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("����һ���ַ�");
        char myChar = scanner.next().charAt(0);
        switch(myChar){
            case 'a':
                System.out.println("a");
            break;
            case 'b':
            case 'c':
                System.out.println("b");
            break;
            default:
                System.out.println("no data");
            break;
        }
    }
}