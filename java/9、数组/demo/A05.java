
public class A05 {
    public static void main(String[] args) {
        //n2变化不会影响到n1，值拷贝
    	int n1 = 10;
        int n2 =  n1;
        n2 = 80;
        System.out.println("n1="+n1+"；n2="+n2);

        //arr1变化不会影响到arr，引用拷贝，拷贝的是地址
        int arr[] = {1,2,3};
        for (int i=0;i<arr.length ;i++ ) {
            System.out.println("第"+(i+1)+"元素值为"+arr[i]);
        }
        int arr1[] = arr;
        arr1[0] = 5;
        for (int i=0;i<arr.length ;i++ ) {
            System.out.println("第"+(i+1)+"元素值为"+arr[i]);
        }

        // 数组的值拷贝
        int myArr[] = {1,2,3};
        //开辟一个新空间
        int myArr1[] = new int[myArr.length];
        for (int i=0;i<myArr.length ;i++ ) {
           myArr1[i] = myArr[i];
        }
        //不会修改myArr的值
        myArr1[0] = 50;
        for (int i=0;i<myArr.length ;i++ ) {
            System.out.println("第"+(i+1)+"元素值为"+myArr[i]);
        }
    }
}