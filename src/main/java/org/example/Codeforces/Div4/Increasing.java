
package org.example.Codeforces.Div4;
//https://codeforces.com/contest/1742/problem/A

import java.util.Arrays;
import java.util.Scanner;

public class Increasing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
             Arrays.sort(arr);
            if (n == 1) {
                System.out.println("YES");
                continue;
            }
            boolean check = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] <= arr[i]) {
                    System.out.println("NO");
                    check = true;
                    break;
                }

            }
            if (!check) {
                System.out.println("YES");
            }

        }
    }
}
