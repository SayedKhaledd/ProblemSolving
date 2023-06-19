package org.example.Codeforces.Div4;
//https://codeforces.com/contest/1742/problem/A

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if (a == b + c || b == a + c || c == b + a) {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
