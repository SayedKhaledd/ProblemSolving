package HackerRank.ProblemSolving;
//https://www.hackerrank.com/challenges/plus-minus/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int counter1 = 0, counter2 = 0, counter3 = 0;
        for (int i = 0; i < n; i++) {

            a[i] = scan.nextInt();
            if (a[i] > 0) {
                counter1++;
            } else if (a[i] < 0) {
                counter2++;

            } else {
                counter3++;
            }

        }
        System.out.printf("%.6f%n%.6f%n%.6f", counter1 / (double) n, counter2 / (double) n, counter3 / (double) n);

    }
}
