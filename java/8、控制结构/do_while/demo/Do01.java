//���� java.util ���� Scanner ��
public class Do01 {
    public static void main(String[] args) {
    	int j = 1;
    	do{
 			System.out.println("��" + j + "����");
            j++;
    	}while( j < 10 );

        int i = 1;
        int sum = 0;
        int count = 0;
        do{
            if(i % 9 == 0){
                System.out.println("��" + i + "��");
                count++;
                sum = sum + i;
            }
            i++;
        }while( i < 100 );
    }
}