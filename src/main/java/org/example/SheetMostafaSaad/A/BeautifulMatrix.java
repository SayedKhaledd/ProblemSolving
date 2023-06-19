package SheetMostafaSaad.A;

import java.util.Scanner;

//https://codeforces.com/contest/263/problem/A
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int row = 0, col = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scan.nextInt();
                if (arr[i][j] == 1) {
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        System.out.println((int) (Math.abs(row - 3) + Math.abs(col - 3)));
    }
}
