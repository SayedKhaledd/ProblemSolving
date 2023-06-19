package org.example.ACMCairo.Phase0;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/H
public class GoodOrBad {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0) {
            String a = scan.next();
        if(a.contains("010") || a.contains("101")) System.out.println("Good");
        else System.out.println("Bad");
        }
    }
}
