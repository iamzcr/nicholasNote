import java.util.Scanner;
public class B04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String pwd = "";
        int count= 3;
        for(;;){
            if(count<=0){
                 System.out.println("�������꣬�˳�����...");
                 break;
            }
            System.out.println("�������˺�...");
            name = scanner.next();
            System.out.println("����������...");
            pwd = scanner.next();
            if(name.equals("test") && "test".equals(pwd)){//�ַ����Ƚϣ�����д�������ԣ������Ƽ�����д����"test".equals(pwd),�����ָ��
                System.out.println("��֤�ɹ������ڵ�¼...");
                break;
            }
            count--;
            System.out.println("�㻹��"+count+"����...");
        }
    }
}