package org.example.ACMCairo.Phase0;
//https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/H

import java.util.Scanner;

public class TwoNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("floor " + a + " / " + b + " = " + a / b);

        System.out.println("ceil " + a + " / " + b + " = " + (int) Math.ceil(((double) a) / b));

        System.out.print("round " + a + " / " + b + " = " + (int) Math.round(((double) a) / b));

    }
}