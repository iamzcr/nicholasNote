//java允许将同一个类中多个同名功能但参数个数不同的方法，封装成一个方法。可以通过可变参数实现
//一个形参列表中，只能有一个可变参数
public class M01 {
    public static void main(String[] args) {
		Test t  = new Test();
        int sum = t.sum(1,1,10,20,30);
        System.out.println(sum);
        //可变参数的实参可以是数组
        String arr[] = {"1","2","3"};
        t.test(arr);
        t.test1(1.1,arr);
    }
}
class Test{
    //int...表示接受多个int类型的参数
    //可变参数可以当做数组去处理
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
    //可变参数可以和普通参数一起放在形参列表，但是可变参数要放在最后
    public void test1(double num,String... nums){
        System.out.println(nums.length);
    }
}
