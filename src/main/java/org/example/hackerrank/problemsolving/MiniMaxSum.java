package org.example.hackerrank.problemsolving;
//https://www.hackerrank.com/challenges/mini-max-sum/problem

import java.util.Scanner;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long[] arr = new long[5];


        for (int i = 0; i < 5; i++) {
            arr[i] = scan.nextLong();
        }
        long min = arr[0], max = arr[4];
        int indexmin = 0, indexmax = 4;
        for (int i = 0; i < 5; i++) {

            if (arr[i] < min) {
                min = arr[i];
                indexmin = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                indexmax = i;
            }

        }
        long summin = 0, summax = 0;
        for (int i = 0; i < 5; i++) {
            if (i != indexmax) summin += arr[i];
            if (i != indexmin) summax += arr[i];

        }
        System.out.print(summin + " " + summax);

    }
}
