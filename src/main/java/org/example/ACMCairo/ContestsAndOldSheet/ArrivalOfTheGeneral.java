package org.example.ACMCairo.ContestsAndOldSheet;
//https://codeforces.com/contest/144/problem/A


import java.util.Scanner;

public class ArrivalOfTheGeneral {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];

        }

        int max_index = getindexformax(arr, max);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];

        }
        int min_index = getindexformin(arr, min);

        int counter = 0;
        for (int i = max_index; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
            counter++;
        }
        if (max_index > min_index) min_index++;
        for (int i = min_index; i < arr.length - 1; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            counter++;
        }
        System.out.println(counter);
    }

    public static int getindexformax(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) return i;

        }
        return -1;
    }

    public static int getindexformin(int[] arr, int ele) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ele) return i;

        }

        return -1;
    }
}