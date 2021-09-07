
public class A02 {
    public static void main(String[] args) {
    	//数组动态初始化
    	int test[]  = new int[3];
    	for (int i=0;i<test.length ;i++ ) {
        	System.out.println("第"+i+"元素值为"+test[i]);
    	}
        //数组动态初始化
    	int[] test1  = new int[3];
    	for (int i=0;i<test1.length ;i++ ) {
        	System.out.println("第"+i+"元素值为"+test1[i]);
    	}
        
         //静态初始化
        int[] test2  = {0,0,0};
        for (int i=0;i<test2.length ;i++ ) {
            System.out.println("第"+i+"元素值为"+test1[i]);
        }
        //静态初始化
        int test3[]  = {0,0,0};
        for (int i=0;i<test3.length ;i++ ) {
            System.out.println("第"+i+"元素值为"+test1[i]);
        }



        //先声明,还没分配空间
        int myArr[];
        //再初始化，分配空间
        myArr = new int[3];
        for (int i=0;i<myArr.length ;i++ ) {
            System.out.println("第"+i+"元素值为"+myArr[i]);
        }
    }
}