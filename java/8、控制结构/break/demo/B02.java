//break语句出现在多层嵌套的语句块中时，可以通过标签(label)指明要终止的是那一块语句块
//如果没有指定break，默认退出最近的语句块
//break后指定到那个label就退出到哪里
//开发中尽量不要使用label
public class B02 {
    public static void main(String[] args) {
        label1:
        for(int j = 0;j < 100;j++){
        lable2:
             for(int i = 0;i < 100;i++){
                if(i == 2){
                    break label1;
                }
                System.out.println("i="+i);
            }
        }
    }
}