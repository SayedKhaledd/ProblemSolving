package ACMCairo.ContestsAndOldSheet;
//https://codeforces.com/contest/499/problem/A

import java.util.Arrays;
import java.util.Scanner;

public class WatchingAMovie {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int x = scan.nextInt();
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++)
                arr[i][j] = scan.nextInt();

        }
        int counter = 0;
        for (int i = 0, k = 1, j = 0; i < n; ) {
            if (k + x <= arr[i][j]) {
                k += x;
            } else {

                counter += arr[i][j + 1] + 1 - k;
                k = arr[i][j + 1] + 1;
                i++;

            }

        }
        System.out.println(counter);

    }

}

