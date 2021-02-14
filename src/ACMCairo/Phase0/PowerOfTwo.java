package ACMCairo.Phase0;

import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/223338/problem/A
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();

        if (n == 1) System.out.println("YES");
        else {
            for (long i = 2; i <= n; i *= 2) {
                if (i == n) {
                    System.out.println("YES");
                    System.exit(0);
                }
            }

            System.out.println("NO");
        }
    }

}
