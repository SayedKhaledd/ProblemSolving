package Codeforces.Div2;

import java.util.Scanner;

//https://codeforces.com/contest/1766/problem/A
public class ExtremelyRound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n <= 10) {
                System.out.println(n);
            } else {
                String s=n+"";
                System.out.println(10+(s.length()-2)*9+s.charAt(0)-48-1);
            }
        }
    }
}
