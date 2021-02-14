package ACMCairo.Phase0;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/W
public class MirrorArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length/2; j++) {
                int index = (arr[i].length - (j + 1)) % arr[i].length;
                int temp = arr[i][j];
                arr[i][j] = arr[i][index];
                arr[i][index] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
