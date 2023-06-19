package org.example.ACMCairo.Phase0;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/R
public class AgeInDays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        int years=n/365;
        int remainingMonths= n%365;
        int months=remainingMonths/30;
        int Days=remainingMonths%30;

        System.out.println(years +" years\n"+ months+" months\n"+ Days+" days");


    }
}
