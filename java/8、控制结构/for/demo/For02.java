public class For02 {
    public static void main(String[] args) {
        //��ʼ���͵���д�������ط�������for����ķֺŲ���ʡ��
        int i = 1;
        for(;i < 10;){
            System.out.println("��" + i + "����");
            i++;
        }
        
        for(int j = 0,k=0;j < 3;j++,k+=2){
            System.out.println("j��" + j + "����;"+"k��" + k + "����");
        }
        System.out.println("��" + i + "����");
    }
}