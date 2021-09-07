//导入 java.util 包的 Scanner 类
public class Do01 {
    public static void main(String[] args) {
    	int j = 1;
    	do{
 			System.out.println("第" + j + "个数");
            j++;
    	}while( j < 10 );

        int i = 1;
        int sum = 0;
        int count = 0;
        do{
            if(i % 9 == 0){
                System.out.println("第" + i + "数");
                count++;
                sum = sum + i;
            }
            i++;
        }while( i < 100 );
    }
}