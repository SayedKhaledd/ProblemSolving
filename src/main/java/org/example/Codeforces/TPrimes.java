package org.example.Codeforces;

import org.example.Library.MyScanner;

import java.io.IOException;
import java.util.Arrays;

//https://codeforces.com/group/i5f48OH2Es/contest/424091/problem/A
public class TPrimes {

    static final int MAX = 1000001;
    static boolean[] primes;

    public static void sieve() {
        primes = new boolean[MAX];
        Arrays.fill(primes, true);

        for (int i = 2; i * i <= MAX; i++)
            if (primes[i])
                for (int j = i * i; j < MAX; j += i)
                    primes[j] = false;


    }

    public static void main(String[] args) throws IOException {
        sieve();
        MyScanner scan = new MyScanner();
        int n = scan.readInt();
        while (n-- > 0) {
            long x = scan.readLong();
            int sqt = (int) Math.sqrt(x);
            if (x == 1)
                System.out.println("NO");
            else if (primes[sqt] && (long) sqt * sqt == x) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }

    }
}
