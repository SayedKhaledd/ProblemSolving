package org.example.ACMCairo.Phase0;
//https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/H

import java.util.Scanner;

public class OnePrime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (isPrime(n)) System.out.println("YES");
        else System.out.println("NO");

    }

    public static boolean isPrime(int value) {
        int n = value - 1;
        while (n != 1) {
            if (value % n == 0) return false;
            n--;

        }
        return true;

    }


}