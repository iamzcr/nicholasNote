//java����ͬһ�����ж��ͬ�����ܵ�����������ͬ�ķ�������װ��һ������������ͨ���ɱ����ʵ��
//һ���β��б��У�ֻ����һ���ɱ����
public class M01 {
    public static void main(String[] args) {
		Test t  = new Test();
        int sum = t.sum(1,1,10,20,30);
        System.out.println(sum);
        //�ɱ������ʵ�ο���������
        String arr[] = {"1","2","3"};
        t.test(arr);
        t.test1(1.1,arr);
    }
}
class Test{
    //int...��ʾ���ܶ��int���͵Ĳ���
    //�ɱ�������Ե�������ȥ����
    public int sum(int... nums){
       System.out.println(nums.length);
       int sum = 0;
       for(int i =0;i<nums.length;i++){
            sum+=nums[i];
       }
       return sum;
    }
    public void test(String... nums){
        System.out.println(nums.length);
    }
    //�ɱ�������Ժ���ͨ����һ������β��б����ǿɱ����Ҫ�������
    public void test1(double num,String... nums){
        System.out.println(nums.length);
    }
}
