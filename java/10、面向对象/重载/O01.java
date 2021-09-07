public class O01 {
    public static void main(String[] args) {
		Test t  = new Test();
        System.out.println(t.cal(1,1));
        System.out.println(t.cal(1,1.1));
    }
}
//java中允许同一个类中，多个方法同名存在，但是形参列表不一致，例如 System.out.println();out是PrintStream的类型
class Test{
    public int cal(int i,int j){
       return i + j;
    }
    public double cal(int i,double j){
    	return i + j;
    }
}
