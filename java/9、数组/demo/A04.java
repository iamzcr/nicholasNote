
public class A04 {
    public static void main(String[] args) {
    	char chars[] = new char[26];
    	for (int i=0;i<chars.length ;i++ ) {
    		chars[i] = (char)('A'+ i);
    	}
    	for (int i=0;i<chars.length ;i++ ) {
            System.out.println("第"+(i+1)+"元素值为"+chars[i]);
        }


        int arr[] = {1,5,6,9,44,85,96,56,22};
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i<arr.length ; i++ ) {
            if(max<arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("最大值为"+arr[maxIndex]);

    }
}