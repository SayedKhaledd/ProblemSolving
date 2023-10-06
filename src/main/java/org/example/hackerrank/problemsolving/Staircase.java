package org.example.hackerrank.problemsolving;
//https://www.hackerrank.com/challenges/staircase/problem

import java.util.Scanner;

public class Staircase {

    // Complete the staircase function below.


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0, j = n - 1; i < n; i++, j--) {
            for (int k = 0; k < j; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
                System.out.print("#");

            System.out.println();
        }


    }
}
