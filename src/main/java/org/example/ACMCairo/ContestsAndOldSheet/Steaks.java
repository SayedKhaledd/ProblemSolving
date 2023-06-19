package ACMCairo.ContestsAndOldSheet;
//https://codeforces.com/gym/102263/problem/H

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Steaks {
    public static void main(String[] args) throws IOException {

        InputStreamReader inr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inr);
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        long p = 0;
        while (n > 0) {
            p += 5;
            n = n - k;
        }
        if (p < 10)
            p = 10;
        System.out.println(p);

    }
}


