package HackerRank.ProblemSolving;

//https://www.hackerrank.com/challenges/recursive-digit-sum/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

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
