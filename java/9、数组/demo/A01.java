
public class A01 {
    public static void main(String[] args) {
    	double[] test = {1,2,5,5,4.6,6};
        double weight = 0;
        System.out.println("数组长度"+test.length);
    	for (int i=0;i<test.length ;i++ ) {
            weight+=test[i];
        	System.out.println("第"+i+"元素值为"+test[i]);
    	}
        System.out.println("总数："+weight);
    }
}