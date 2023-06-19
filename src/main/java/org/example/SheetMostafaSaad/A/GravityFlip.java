package org.example.SheetMostafaSaad.A;
//Not yet
import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
            if (arr[j] < arr[i]) {
                arr[j] += arr[i] - arr[j];
                arr[i] -= arr[i] - arr[j];
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
