package org.example.ACMCairo.ContestsAndOldSheet;;

//https://codeforces.com/contest/1451/problem/A

import java.util.Scanner;

public class SubtractOrDivide {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n == 1) System.out.println(0);
            else if (n == 2) System.out.println(1);
            else if (n % 2 == 0 || n == 3) System.out.println(2);
            else if (n % 2 != 0) System.out.println(3);


        }
    }


}
