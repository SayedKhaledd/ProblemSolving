package org.example.Codeforces.Div3;
//https://codeforces.com/contest/1741/problem/A

import java.util.Scanner;

public class CompareTShirtSizes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String a = scan.next();
            String b = scan.next();
            if (getPriority(a.charAt(a.length() - 1)) == getPriority(b.charAt(b.length() - 1))) {
                if (a.length() == b.length())
                    System.out.println("=");
                else if (a.charAt(a.length() - 1) == 'S')
                    System.out.println(a.length() > b.length() ? "<" : ">");
                else
                    System.out.println(a.length() > b.length() ? ">" : "<");
            } else if (getPriority(a.charAt(a.length() - 1)) > getPriority(b.charAt(b.length() - 1))) {
                System.out.println(">");
            } else {
                System.out.println("<");
            }
        }
    }

    public static int getPriority(char c) {
        return c == 'L' ? 3 : c == 'M' ? 2 : 1;
    }
}
