//https://codeforces.com/contest/381/problem/A

import java.util.Scanner;

public class SeragandDima {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sumSer = 0, sumDima = 0, turn = 0, minIndex = 0, maxIndex = n - 1;
        for (int i = 0; i < n; i++) {
            int max = Math.max(arr[minIndex], arr[maxIndex]);
            if (turn == 0) {
                //seragi turn
                sumSer += max;
                turn = 1;
            } else {
                //dima turn
                sumDima += max;
                turn = 0;
            }
            if (max == arr[minIndex]) {
                minIndex++;
            } else if (max == arr[maxIndex]) {
                  maxIndex--;
            }
        }

        System.out.println(sumSer + " " + sumDima);
    }
}
