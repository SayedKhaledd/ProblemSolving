package ACMCairo.ContestsAndOldSheet;
//https://codeforces.com/contest/770/problem/A

import java.util.Scanner;

public class NewPassword {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        char[] c = new char[k];
        int x = 97 + (int) (Math.random() * 25);
        for (int i = 0; i < k; i++) {
            if (x == 123) {
                x = 97;
            }
            c[i] = (char) x;

            x++;
        }
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < n; i++) {

            s.append(c[i % k]);

        }
        System.out.println(s.toString());

    }

}


