package org.example.ACMCairo.Phase0;
//https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/I

import java.util.Scanner;

public class SmallestPair {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {

            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();

            }
                  int sum=arr[0]+arr[1]+2-1;
            for (int i = 0; i < n-1; i++) {
                for (int j=i+1;j<n;j++) {

                    int x=arr[i]+arr[j]+(j+1)-(i+1);
                    if(x<sum)sum=x;

                }

            }

            System.out.println(sum);
        }
    }
}
