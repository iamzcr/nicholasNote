import java.util.Scanner;
public class A03 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	double scores[] = new double[5];
    	for (int i=0;i<scores.length ;i++ ) {
    		System.out.println("�������"+(i+1)+"��Ԫ��");
    		scores[i] = scanner.nextDouble();
    	}
    	for (int i=0;i<scores.length ;i++ ) {
            System.out.println("��"+(i+1)+"Ԫ��ֵΪ"+scores[i]);
        }
    }
}