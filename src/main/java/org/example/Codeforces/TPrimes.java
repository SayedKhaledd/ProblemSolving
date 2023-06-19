package org.example.Codeforces;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://codeforces.com/group/i5f48OH2Es/contest/424091/problem/A
public class TPrimes {
    private static class MyScanner {
        static StringTokenizer st;
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static PrintWriter pt = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        public static String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(reader.readLine().trim());
            return st.nextToken();
        }

        public static int readInt() throws IOException {
            return Integer.parseInt(next());
        }

        public static long readLong() throws IOException {
            return Long.parseLong(next());
        }

        public static double readDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public static char readChar() throws IOException {
            return next().charAt(0);
        }

        public static String readLine() throws IOException {
            return reader.readLine().trim();
        }
    }

    static final int MAX = 1000001;
    static boolean[] primes;

    public static void sieve() {
        primes = new boolean[MAX];
        Arrays.fill(primes, true);

        for (int i = 2; i * i <= MAX; i++)
            if (primes[i])
                for (int j = i * i; j < MAX; j +=  i)
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
