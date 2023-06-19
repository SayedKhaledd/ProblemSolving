package org.example.AssuitSheet.NewComers.Sheet4;

import java.util.*;

//https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/I
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] c = s.toCharArray();
        boolean b = true;
        for (int i = 0, j = c.length - 1; i < c.length / 2; i++, j--) {
            if (c[i] != c[j]) {
                b = false;
                break;
            }
        }
        System.out.println(b ? "YES" : "NO");

    }


}
