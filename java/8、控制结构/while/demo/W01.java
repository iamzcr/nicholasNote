//导入 java.util 包的 Scanner 类
public class W01 {
    public static void main(String[] args) {
        int j = 1;
        while( j < 10 ) {
            System.out.println("第" + j + "个数");
            j++;
        }

        int i = 1;
        int sum = 0;
        int count = 0;
        while( i < 100 ) {
            if(i % 9 == 0){
                System.out.println("第" + i + "数");
                count++;
                sum = sum + i;
            }
             i++;
        }
    }
}