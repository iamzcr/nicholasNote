public class M02 {
    public static void main(String[] args) {
		Test t  = new Test();
        double arr[] = {85,86.3,96.6};
        t.test("zcr",arr);
    }
}
class Test{
  
    public void test(String name,double... nums){
    	double sumScore = 0;
    	for (int i = 0; i<nums.length ; i++ ) {
    		sumScore+=nums[i];
    	}
        System.out.println(name+"×Ü·Ö:"+sumScore);
    }
}
