
public class A05 {
    public static void main(String[] args) {
        //n2�仯����Ӱ�쵽n1��ֵ����
    	int n1 = 10;
        int n2 =  n1;
        n2 = 80;
        System.out.println("n1="+n1+"��n2="+n2);

        //arr1�仯����Ӱ�쵽arr�����ÿ������������ǵ�ַ
        int arr[] = {1,2,3};
        for (int i=0;i<arr.length ;i++ ) {
            System.out.println("��"+(i+1)+"Ԫ��ֵΪ"+arr[i]);
        }
        int arr1[] = arr;
        arr1[0] = 5;
        for (int i=0;i<arr.length ;i++ ) {
            System.out.println("��"+(i+1)+"Ԫ��ֵΪ"+arr[i]);
        }

        // �����ֵ����
        int myArr[] = {1,2,3};
        //����һ���¿ռ�
        int myArr1[] = new int[myArr.length];
        for (int i=0;i<myArr.length ;i++ ) {
           myArr1[i] = myArr[i];
        }
        //�����޸�myArr��ֵ
        myArr1[0] = 50;
        for (int i=0;i<myArr.length ;i++ ) {
            System.out.println("��"+(i+1)+"Ԫ��ֵΪ"+myArr[i]);
        }
    }
}