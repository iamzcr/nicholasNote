//break�������ڶ��Ƕ�׵�������ʱ������ͨ����ǩ(label)ָ��Ҫ��ֹ������һ������
//���û��ָ��break��Ĭ���˳����������
//break��ָ�����Ǹ�label���˳�������
//�����о�����Ҫʹ��label
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