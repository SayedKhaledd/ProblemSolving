package org.example;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0, sum_b1 = 0, sum_b2 = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                sum_b2 = 0;
                sum = sum_b2;
            }
            if (i == 1) {
                sum_b1 = 1;
                sum = sum_b1;
            }
            if (i >= 2) {
                sum = sum_b1 + sum_b2;
                sum_b2 = sum_b1;
                sum_b1 = sum;
            }
                System.out.print(sum+" ");
        }

    }


    public static int sum(int x, int y) {
        return x + y;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static double sum(double x, double y, int z) {
        return x + y + z;
    }

    public static double sum(double x, double y, double z) {
        return x + y + z;
    }


}