//数组扩容
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

       	    System.out.println("输入一个整型，扩容数组....");
    		int addNum = scanner.nextInt();

			arrNew[arrNew.length-1] = addNum;
	        arr = arrNew;
	        //扩容后
	        for (int i = 0; i<arr.length ;i++ ) {
	            System.out.print(arr[i]+"\t");
        	}
        	System.out.print("\n");
        	System.out.println("是否继续添加....");
        	char key = scanner.next().charAt(0);
        	if(key == 'n'){
        		return;
        	}
		}while(true);
        
    }
}