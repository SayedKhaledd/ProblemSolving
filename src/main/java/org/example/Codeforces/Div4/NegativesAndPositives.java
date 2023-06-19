package Codeforces.Div4;
/*
 * not yet
 */

import java.util.Scanner;

//https://codeforces.com/contest/1791/problem/E
public class NegativesAndPositives {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int sum = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
                if (i > 0) {
                    if (arr[i] * -1 + arr[i - 1] * -1 > arr[i] + arr[i - 1]) {
                        arr[i] = arr[i] * -1;
                        arr[i - 1] = arr[i - 1] * -1;
                    }
                    sum += arr[i - 1];

                }

            }
            sum += arr[n - 1];
            System.out.println(sum);


        }
    }
}
