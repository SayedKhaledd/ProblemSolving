package org.example.SheetMostafaSaad.A;

import java.util.Scanner;

//https://codeforces.com/contest/112/problem/A
public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        a = a.toLowerCase();
        b = b.toLowerCase();
        int x = a.compareTo(b);
        System.out.println(Integer.compare(x, 0));
    }
}
