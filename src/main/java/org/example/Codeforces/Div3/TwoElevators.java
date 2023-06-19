package Codeforces.Div3;
//https://codeforces.com/contest/1729/problem/A

import java.util.Scanner;

public class TwoElevators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int x = a - 1;
            int y = Math.abs(c - b) + (c - 1);
            if (x < y)
                System.out.println("1");
            else if (y < x)
                System.out.println("2");
            else
                System.out.println("3");
        }
    }
}
