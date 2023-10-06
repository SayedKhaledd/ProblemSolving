package org.example.hackerrank.problemsolving;

//https://www.hackerrank.com/challenges/recursive-digit-sum/problem

import java.io.IOException;
import java.util.Scanner;

public class RecursiveDigitSum {

    public static int shit(String x, int n) {
        long sum = 0;
        for (int i = x.length() - 1; i >= 0; i--) {
            int b = x.charAt(i) - 48;
            b = b * n;
            sum += b;
        }
        if (sum < 10) {
            return (int) sum;
        }
        return shit(sum + "", 1);
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        int n = scan.nextInt();

        System.out.print(shit(s, n));

    }
}
