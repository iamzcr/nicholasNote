public class B01 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1;i < 100;i++){
            System.out.println(i);
            int num = (int)(Math.random()*100)+1;
            count++;
            if(num == 97){
                break;
            }
        }
        System.out.println(count);
    }
}