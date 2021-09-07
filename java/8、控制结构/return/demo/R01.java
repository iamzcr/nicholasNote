public class R01 {
    public static void main(String[] args) {
        for(int i = 1;i < 10;i++){
            if(i == 2){
                System.out.println("i="+i);
                // break;
                // return;//如果用在方法，标识退出方法，如果用在main方法，标识退出该程序
                continue;
            }
            System.out.println("hello");
        }
        System.out.println("go to....");
    }
}