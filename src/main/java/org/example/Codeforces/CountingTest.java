package org.example.Codeforces;

import java.io.*;
import java.util.StringTokenizer;

//https://codeforces.com/problemset/gymProblem/101532/D?fbclid=IwAR10GtsqHMnr722UcOBntf7BuVGsfReqiZSREYLZ_HsWX6OaL7vzIssQhsI
public class CountingTest {
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

    public static void main(String[] args) throws IOException {
        int t = MyScanner.readInt();
        while (t-- > 0) {
            int n = MyScanner.readInt();
            int q = MyScanner.readInt();
            StringBuilder s = new StringBuilder("");
            int[] freq = new int[26];
            for (int i = 0; i < n; i++) {
                char c = MyScanner.readChar();
                s.append(c);
                freq[c - 97]++;
            }
            for (int i = 0; i < q; i++) {
                int l = MyScanner.readInt();
                int r = MyScanner.readInt();
                char c = MyScanner.readChar();
                if (l == 1 && r == n) {
                    MyScanner.pt.println(freq[c]);
                    MyScanner.pt.close();
                } else if (l < n && r <= n) {

                }

            }
        }
    }
}
