//数组翻转

public class A06 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,54,62,65};
       	int temp = 0;
       	int len = arr.length;
       	for (int i = 0; i<len/2 ;i++ ) {
       		temp = arr[len-1-i];
       		arr[len-1-i] =  arr[i];
       		arr[i] = temp;
       	}
       	for (int i = 0; i<arr.length ;i++ ) {
       		System.out.print("第"+(i)+"元素值为"+arr[i]+"\t");
       	}

    }
}