//��������
import java.util.Scanner;
public class A08 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = {1,2,3};
		do{
		
	      	int arrNew[] = new int[arr.length+1];
	      	
	       	for (int i = 0; i<arr.length ;i++ ) {
	       		arrNew[i] = arr[i];
	       	}

       	    System.out.println("����һ�����ͣ���������....");
    		int addNum = scanner.nextInt();

			arrNew[arrNew.length-1] = addNum;
	        arr = arrNew;
	        //���ݺ�
	        for (int i = 0; i<arr.length ;i++ ) {
	            System.out.print(arr[i]+"\t");
        	}
        	System.out.print("\n");
        	System.out.println("�Ƿ�������....");
        	char key = scanner.next().charAt(0);
        	if(key == 'n'){
        		return;
        	}
		}while(true);
        
    }
}