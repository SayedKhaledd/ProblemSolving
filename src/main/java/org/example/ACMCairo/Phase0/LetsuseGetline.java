package org.example.ACMCairo.Phase0;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/B
public class LetsuseGetline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();
        int n=s.indexOf('\\');
        System.out.println(s.substring(0,n));
    }
}
