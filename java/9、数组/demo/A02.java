
public class A02 {
    public static void main(String[] args) {
    	//���鶯̬��ʼ��
    	int test[]  = new int[3];
    	for (int i=0;i<test.length ;i++ ) {
        	System.out.println("��"+i+"Ԫ��ֵΪ"+test[i]);
    	}
        //���鶯̬��ʼ��
    	int[] test1  = new int[3];
    	for (int i=0;i<test1.length ;i++ ) {
        	System.out.println("��"+i+"Ԫ��ֵΪ"+test1[i]);
    	}
        
         //��̬��ʼ��
        int[] test2  = {0,0,0};
        for (int i=0;i<test2.length ;i++ ) {
            System.out.println("��"+i+"Ԫ��ֵΪ"+test1[i]);
        }
        //��̬��ʼ��
        int test3[]  = {0,0,0};
        for (int i=0;i<test3.length ;i++ ) {
            System.out.println("��"+i+"Ԫ��ֵΪ"+test1[i]);
        }



        //������,��û����ռ�
        int myArr[];
        //�ٳ�ʼ��������ռ�
        myArr = new int[3];
        for (int i=0;i<myArr.length ;i++ ) {
            System.out.println("��"+i+"Ԫ��ֵΪ"+myArr[i]);
        }
    }
}