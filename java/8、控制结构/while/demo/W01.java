//���� java.util ���� Scanner ��
public class W01 {
    public static void main(String[] args) {
        int j = 1;
        while( j < 10 ) {
            System.out.println("��" + j + "����");
            j++;
        }

        int i = 1;
        int sum = 0;
        int count = 0;
        while( i < 100 ) {
            if(i % 9 == 0){
                System.out.println("��" + i + "��");
                count++;
                sum = sum + i;
            }
             i++;
        }
    }
}