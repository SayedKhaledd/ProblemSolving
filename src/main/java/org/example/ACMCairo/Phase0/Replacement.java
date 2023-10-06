package org.example.ACMCairo.Phase0;
//https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/C

import java.util.Scanner;


public class Replacement {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                a[i] = 2;
            } else if (a[i] > 0) {
                a[i] = 1;
            }


        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }


}
