public class Demo01 {
    public static void main(String[] args) {
        double money = 100000;
        int count = 0;
        while(money>1000){
            if(money>50000){
                money = money - (money*0.05);
                count++;
            }else if (money>=1000) {
                money -= 1000;
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);
    }
}