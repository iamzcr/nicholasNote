//continue�������ڶ��Ƕ�׵�������ʱ������ͨ����ǩ(label)ָ��Ҫ��ֹ������һ������
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