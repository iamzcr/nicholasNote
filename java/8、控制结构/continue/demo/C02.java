//continue语句出现在多层嵌套的语句块中时，可以通过标签(label)指明要终止的是那一块语句块
public class C02 {
    public static void main(String[] args) {
        label1:
        for(int j = 0;j < 5;j++){
        lable2:
             for(int i = 0;i < 5;i++){
                if(i == 2){
                    continue lable2;
                }
                System.out.println("i="+i);
            }
        }
    }
}