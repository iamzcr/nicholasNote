
public class A01 {
    public static void main(String[] args) {
    	double[] test = {1,2,5,5,4.6,6};
        double weight = 0;
        System.out.println("���鳤��"+test.length);
    	for (int i=0;i<test.length ;i++ ) {
            weight+=test[i];
        	System.out.println("��"+i+"Ԫ��ֵΪ"+test[i]);
    	}
        System.out.println("������"+weight);
    }
}