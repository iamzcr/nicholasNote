//Êı×éÀ©Èİ

public class A07 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
      	int arrNew[] = new int[arr.length+1];
      	
       	for (int i = 0; i<arr.length ;i++ ) {
       		arrNew[i] = arr[i];
       	}
		arrNew[arrNew.length-1] = 4;
        arr = arrNew;
		for (int i = 0; i<arrNew.length ;i++ ) {
       		System.out.print("arrNew"+arrNew[i]+"\t");
       	}
         System.out.print("arr\n");
        for (int i = 0; i<arr.length ;i++ ) {
            System.out.print("arr"+arr[i]+"\t");
        }
    }
}