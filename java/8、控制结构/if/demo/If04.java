//���� java.util ���� Scanner ��
import java.util.Scanner;
public class If04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("����һ��������");
        int sal = scanner.nextInt();
        if(sal > 80){
            System.out.println("�����Ա�");
            //�ַ���ת�ַ�charAt
            char sex = scanner.next().charAt(0);
            if(sex == '��'){
                System.out.println("��");
            }else{
                System.out.println("Ů");
            }
        }else{
            System.out.println("error");
        }

    }
}