public class For03 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i = 1;i < 100;i++){
            if(i % 9 == 0){
                count++;
                sum = sum + i;
                System.out.println("µÚ" + i + "Êý");
            }
          
        }
        System.out.println("sum = " + sum+";count = " + count );
        
    }
}