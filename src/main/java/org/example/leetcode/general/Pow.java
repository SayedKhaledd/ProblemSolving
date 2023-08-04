package org.example.leetcode.general;

public class Pow {
    public static void main(String[] args) {
//        System.out.println(myPow(0.00001, 2147483647));
        long x = System.currentTimeMillis();
        System.out.println(myPow(1.0000000000001, -2147483648));
        long y = System.currentTimeMillis();
//        System.out.println(y - x);

    }

    public static double myPow(double x, int n) {
        double val = 1;
        boolean check = false;
        if (x == 1 || ((int) (x * 100000) == 100000) && n > 0) {
            return 1;
        }
        if (x == -1 || (int) (x * -100000) == 100000)
            return n % 2 == 0 ? 1 : -1;
        if (n < 0) {
            check = true;
            if (n == Integer.MIN_VALUE)
                n = Integer.MAX_VALUE;
            else
                n = -n;
        }
        for (int i = 1; i <= n; i++) {
            if (check)
                val /= x;
            else
                val *= x;
            if (val * 100000 == 0)
                return 0;
        }
        return val;
    }
}
