public class For02 {
    public static void main(String[] args) {
        //初始化和迭代写在其他地方，但是for里面的分号不能省略
        int i = 1;
        for(;i < 10;){
            System.out.println("第" + i + "个数");
            i++;
        }
        
        for(int j = 0,k=0;j < 3;j++,k+=2){
            System.out.println("j第" + j + "个数;"+"k第" + k + "个数");
        }
        System.out.println("第" + i + "个数");
    }
}