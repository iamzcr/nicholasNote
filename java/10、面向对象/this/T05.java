//copy array
public class T05 {
    public static void main(String[] args) {
		Test test  = new Test();
		int arr[] = {1,22,3,6};
		int myArr[] = test.test(arr);
		for(int i = 0;i<myArr.length;i++){
			System.out.println(myArr[i]);
		}
    }
}

class Test{

    public int[] test(int[] arr){
		int temp[] = new int[arr.length];
		for(int i = 0;i<arr.length;i++){
			temp[i] = arr[i];
		}
		return temp;
    }

}
