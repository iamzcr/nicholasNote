import java.util.Scanner;
public class A03 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	double scores[] = new double[5];
    	for (int i=0;i<scores.length ;i++ ) {
    		System.out.println("请输入第"+(i+1)+"个元素");
    		scores[i] = scanner.nextDouble();
    	}
    	for (int i=0;i<scores.length ;i++ ) {
            System.out.println("第"+(i+1)+"元素值为"+scores[i]);
        }
    }
}