package org.example.AssuitSheet;
//https://codeforces.com/group/MWSDmqGsZm/contest/326175/problem/I

import java.util.Scanner;


public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int x=n%10;
        n/=10;
        if(x==0)
            System.out.println("YES");
        else if(n%x==0 || x%n==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
