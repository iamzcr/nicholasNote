import java.util.Scanner;
public class B04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String pwd = "";
        int count= 3;
        for(;;){
            if(count<=0){
                 System.out.println("机会用完，退出程序...");
                 break;
            }
            System.out.println("请输入账号...");
            name = scanner.next();
            System.out.println("请输入密码...");
            pwd = scanner.next();
            if(name.equals("test") && "test".equals(pwd)){//字符串比较，两种写法都可以，这种推荐这种写法："test".equals(pwd),避免空指针
                System.out.println("验证成功，正在登录...");
                break;
            }
            count--;
            System.out.println("你还有"+count+"机会...");
        }
    }
}