package AssuitSheet;

import java.util.Scanner;

public class Spiral {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        long[][] arr = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextLong();
            }
        }

        StringBuilder result = new StringBuilder("");

        int left = 0, down = n - 1, right = m - 1, top = 0;
        int dir = 1;
        while (left <= right && top <= down) {
            if (dir == 1) {

                for (int i = left; i <= right; i++) {
                    result.append(arr[top][i]);
                    result.append(" ");
                }
                ++top;
                dir++;
            }
            else if(dir==2){
                for (int i = top; i <= down; i++) {
                    result.append(arr[i][right]);
                    result.append(" ");
                }
                --right;
                dir++;
            }
            else if(dir==3) {
                for (int i = right; i >= left; i--) {
                    result.append(arr[down][i]);
                    result.append(" ");

                }
                down--;
                dir++;
            }
            else if(dir==4) {
                for (int i = down; i >= top; i--) {
                    result.append(arr[i][left]);
                    result.append(" ");
                }
                left++;
                dir=1;
            }
        }
        System.out.println(result);

    }


}
