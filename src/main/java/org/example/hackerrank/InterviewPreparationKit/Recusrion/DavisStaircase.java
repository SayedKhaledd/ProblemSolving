package org.example.hackerrank.InterviewPreparationKit.Recusrion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DavisStaircase {
    static long[] arr = new long[37];
    ;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            int result = t(n, n);
            System.out.println(result % (10000000007L));


        }

    }


    public static int t(int n, int remaind) {

        if (remaind == 1 || remaind == 0) return 1;
        int result = 0;
        int x = 0;
        if (remaind >= 1) {
            if (arr[remaind - 1] == 0) {
                x = t(n, remaind - 1);
                result += x;
                arr[remaind - 1] = x;
            } else {
                result += arr[remaind - 1];
            }
        }
        if (remaind >= 2) {
            if (arr[remaind - 2] == 0) {
                x = t(n, remaind - 2);
                result += x;
                arr[remaind - 2] = x;
            } else {
                result += arr[remaind - 2];
            }

        }
        if (remaind >= 3) {
            if (arr[remaind - 3] == 0) {
                x = t(n, remaind - 3);
                result += x;
                arr[remaind - 3] = x;
            } else {
                result += arr[remaind - 3];
            }

        }
        return result;


    }
}
