public class C01 {
    public static void main(String[] args) {
        for(int i = 1;i < 10;i++){
            if(i == 2){
                continue;
            }
            System.out.println("i="+i);
        }
        int  j = 1;
        while(j<=4){
        	j++;
        	if(j == 2){
                continue;
            }
            System.out.println("j="+j);
        }
    }
}