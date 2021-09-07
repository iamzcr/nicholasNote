public class M03 {
    public static void main(String[] args) {
    	Test t = new Test();
     	if(t.isEven(2)){
			System.out.println("isEven");
     	}else{
     		System.out.println("isNotEven");
     	}
    }
}
class Test{

	public boolean isEven(int num ){
		return num % 2 == 0;
	}
	
}
