package org.example.SPOJ;
/**
 * not yet
 */

import java.util.Scanner;

//https://www.spoj.com/problems/AVG/
public class AVG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int x = scan.nextInt();
                sum += x;
            }
            System.out.println(sum /n);

        }
    }
}
