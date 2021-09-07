//二维数组

public class Yanghui {
    public static void main(String[] args) {
    
        //每个一维数组元素不一样，怎么开空间
        int yanghui[][];
        yanghui = new int[10][];
        for (int i = 0; i<yanghui.length ;i++ ) {
            //必须要开空间
            yanghui[i] = new int[i+1];
             for (int j = 0; j<yanghui[i].length ;j++ ) {
                if(j==0||j ==yanghui[i].length-1){
                	 yanghui[i][j] = 1;
                }else {
                	 yanghui[i][j] = yanghui[i-1][j]+yanghui[i-1][j-1];
                }
            }
        }
        for (int i = 0; i<yanghui.length ;i++ ) {
            for (int j = 0; j<yanghui[i].length ;j++ ) {
                System.out.print(yanghui[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}