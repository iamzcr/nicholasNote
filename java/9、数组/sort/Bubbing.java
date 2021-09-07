//数组扩容
public class Bubbing {
    public static void main(String[] args) {
		int arr[] = {15,65,98,66,52,2,3,-10};
		for (int i = 0; i < arr.length-1; i++) {
			int temp = 0;
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] >arr[j+1] ){//从小到大，<从大到小
					//交换
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//排序后
        for (int i = 0; i<arr.length ;i++ ) {
            System.out.print(arr[i]+"\t");
    	}
    }
}
