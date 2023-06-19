package org.example.Codeforces.Div3;
//https://codeforces.com/contest/1741/problem/B

import java.util.Scanner;

public class FunnyPermutation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n == 3) {
                System.out.println(-1);
                continue;
            }
            int x = 0;

            for (int i = n; i > 0; i--) {

                 if (n == 5) {
                    if (i == Math.ceil(n / 2.0))
                        System.out.print((1) + " ");
                    else if (i == 1)
                        System.out.print(3 + " ");
                    else
                        System.out.print(i + " ");

                } else {

                    if (i == Math.ceil(n / 2.0) && n % 2 != 0)
                        System.out.print((i - 1) + " ");
                    else if (i == n / 2 && n % 2 != 0)
                        System.out.print((i + 1) + " ");
                    else
                        System.out.print(i + " ");
                }


            }



        System.out.println();
    }
}
}
