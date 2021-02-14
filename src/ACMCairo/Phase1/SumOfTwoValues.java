package ACMCairo.Phase1;

import java.util.Arrays;
import java.util.Scanner;


//https://cses.fi/problemset/task/1640/
public class SumOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            arr[i] = x;
            arr2[i] = x;

        }

        int x1 = -1, x2 = -1;
        Arrays.sort(arr2);

        for (int i = 0; i < arr2.length - 1; i++) {
            int j = Arrays.binarySearch(arr2, i + 1, arr2.length, k - arr2[i]);


            if (j > 0) {
                x1 = isFound(arr, arr2[i], 0) + 1;
                x2 = isFound(arr, arr2[j], 0) + 1;
                if (x2 == x1) {
                    x2 = isFound(arr, arr2[j], x1) + 1;
                }

                break;
            }

        }
        if (x1 != -1 && x2 != -1 && x1 != x2) {
            if (x1 > x2) {
                int temp = x1;
                x1 = x2;
                x2 = temp;
            }
            System.out.println(x1 + " " + x2);
        } else System.out.println("IMPOSSIBLE");

    }

    public static int isFound(int[] arr, int x, int start) {

        for (int i = start; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
