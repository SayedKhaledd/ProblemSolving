package org.example.Codeforces.Div4;

import java.util.Scanner;

//https://codeforces.com/contest/1791/problem/C
public class PrependAndAppend {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int counter = n;
            for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
                if (i == j)
                    break;
                else if (s.charAt(i) == s.charAt(j))
                    break;
                else {
                    counter -= 2;
                }
            }
            System.out.println(counter);
        }
    }
}
