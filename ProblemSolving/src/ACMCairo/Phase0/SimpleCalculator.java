package ACMCairo.Phase0;
//https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/C

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        System.out.println(a + " + " + b + " = " + (a + b));

        System.out.println(a + " * " + b + " = " + (a * b));

        System.out.println(a + " - " + b + " = " + (a - b));

    }
}
