//���� java.util ���� Scanner ��
import java.util.Scanner;
public class S01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("����һ���ַ�");
        char myChar = scanner.next().charAt(0);
        //switch(���ʽ)���������ͣ�Ӧ�ú�case����ĳ������ͱ���һ�£����߿����Զ�ת���������໥�Ƚϵ�����
        //switch(���ʽ)�б���Ƿ��ر�����(byte,short,int,char,enum,String)
        //case�е�ֵ�����ǳ����������Ǳ���
        char d = 'd';
        switch(myChar){
            case 'a':
                System.out.println("a");
                break;
            case 'b':
                System.out.println("b");
                break;
            case d://���뱨�������ǳ���
                System.out.println("b");
                break;
            default:
                System.out.println("no data");
                break;
        }
    }
}