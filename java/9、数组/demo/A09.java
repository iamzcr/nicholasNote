//��ά����

public class A09 {
    public static void main(String[] args) {
    	//��̬��ʼ��
        int arr[][] = {{1,2,3},{4,5,6}};
      	
       	for (int i = 0; i<arr.length ;i++ ) {
       		for (int j = 0; j<arr[i].length ;j++ ) {
       			System.out.print(arr[i][j]+"\t");
       		}
       		System.out.print("\n");
       	}

        //��̬��ʼ��
        int myArr[][] = new int[2][3];
        
        for (int i = 0; i<myArr.length ;i++ ) {
            for (int j = 0; j<myArr[i].length ;j++ ) {
                System.out.print(myArr[i][j]+"\t");
            }
            System.out.print("\n");
        }
		//�����󣬳�ʼ��
        int myArr1[][];
        myArr1 = new int[2][3];
        for (int i = 0; i<myArr1.length ;i++ ) {
            for (int j = 0; j<myArr1[i].length ;j++ ) {
                System.out.print(myArr1[i][j]+"\t");
            }
            System.out.print("\n");
        }

        //ÿ��һά����Ԫ�ز�һ������ô���ռ�
        int myArr2[][];
        myArr2 = new int[3][];
        for (int i = 0; i<myArr2.length ;i++ ) {
            //����Ҫ���ռ�
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