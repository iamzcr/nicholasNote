//二维数组

public class A09 {
    public static void main(String[] args) {
    	//静态初始化
        int arr[][] = {{1,2,3},{4,5,6}};
      	
       	for (int i = 0; i<arr.length ;i++ ) {
       		for (int j = 0; j<arr[i].length ;j++ ) {
       			System.out.print(arr[i][j]+"\t");
       		}
       		System.out.print("\n");
       	}

        //动态初始化
        int myArr[][] = new int[2][3];
        
        for (int i = 0; i<myArr.length ;i++ ) {
            for (int j = 0; j<myArr[i].length ;j++ ) {
                System.out.print(myArr[i][j]+"\t");
            }
            System.out.print("\n");
        }
		//声明后，初始化
        int myArr1[][];
        myArr1 = new int[2][3];
        for (int i = 0; i<myArr1.length ;i++ ) {
            for (int j = 0; j<myArr1[i].length ;j++ ) {
                System.out.print(myArr1[i][j]+"\t");
            }
            System.out.print("\n");
        }

        //每个一维数组元素不一样，怎么开空间
        int myArr2[][];
        myArr2 = new int[3][];
        for (int i = 0; i<myArr2.length ;i++ ) {
            //必须要开空间
            myArr2[i] = new int[i+1];
             for (int j = 0; j<myArr2[i].length ;j++ ) {
                myArr2[i][j] = i+1;
            }
        }

         for (int i = 0; i<myArr2.length ;i++ ) {
            for (int j = 0; j<myArr2[i].length ;j++ ) {
                System.out.print(myArr2[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}