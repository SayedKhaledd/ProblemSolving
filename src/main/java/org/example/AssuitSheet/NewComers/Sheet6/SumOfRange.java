package org.example.AssuitSheet.NewComers.Sheet6;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/223338/problem/C
public class SumOfRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long a = scan.nextLong();
        long b = scan.nextLong();

        if (a > b) {
            long temp = a;
            a = b;
            b = temp;

        }
        long partialSum = ((a - 1) * (a) / 2L);
        long totalSum = ((b) * (b + 1) / 2L);

        long sum = totalSum - partialSum;

        long totalEvenSum =  (2L * ((b / 2L) * (b / 2L + 1L) / 2L));
        long partialEvenSum =  (2L * ((a / 2L) * (a / 2L + 1L) / 2L));
        long sumEven = totalEvenSum - partialEvenSum;
        if (a % 2 == 0) sumEven += a;
        long sumOdd = sum - sumEven;
        System.out.println(sum);
        System.out.println(sumEven);
        System.out.println(sumOdd);


    }

}
