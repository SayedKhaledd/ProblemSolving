package org.example.HackerRank.ProblemSolving;
//https://www.hackerrank.com/challenges/a-very-big-sum/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AVeryBigSum {

    // Complete the aVeryBigSum function below.


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[n];
        long s = 0;
        for (int i = 0; i < n; i++)
            a[i] = scan.nextLong();

        for (int i = 0; i < n; i++)
            s += a[i];
        System.out.print(s);
    }
}

