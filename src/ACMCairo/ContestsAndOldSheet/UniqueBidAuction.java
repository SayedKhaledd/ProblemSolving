package ACMCairo.ContestsAndOldSheet;

//https://codeforces.com/contest/1454/problem/B

import java.util.*;

public class UniqueBidAuction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[][] freq = new int[n][2];
            for (int i = 0; i < n; i++) {
                int x = scan.nextInt();
                freq[x - 1][0]++;
                freq[x - 1][1] = i;

            }
            boolean check = false;
            for (int i = 0; i < n; i++) {
                if (freq[i][0] == 1) {
                    System.out.println(freq[i][1] + 1);
                    check = true;
                    break;
                }
            }
            if (!check) System.out.println(-1);
        }
    }


}
