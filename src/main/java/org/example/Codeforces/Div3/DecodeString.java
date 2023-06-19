package org.example.Codeforces.Div3;
//https://codeforces.com/contest/1729/problem/B

import java.util.Scanner;

public class DecodeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String code = scan.next();
            StringBuilder output = new StringBuilder("");
            for (int i = n - 1; i >= 0; ) {
                int x;
                if (code.charAt(i) == '0') {
                    x = (code.charAt(i - 2) - 48) * 10 + (code.charAt(i - 1) - 48);
                    i = i - 3;
                } else {
                    x = code.charAt(i) - 48;
                    i--;
                }
                x--;
                char c = (char) (x + 97);
                output.insert(0,c);
            }
            System.out.println(output);
        }
    }
}
