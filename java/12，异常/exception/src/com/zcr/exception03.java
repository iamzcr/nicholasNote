package com.zcr;

public class exception03 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1, n2);
            System.out.println("计算结果" + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数形式不对");
        } catch (ArithmeticException e) {
            System.out.println("出现除数为0的异常");
        }
    }

    public static double cal(double n1, double n2) {
        return n1 / n2;
    }
}
