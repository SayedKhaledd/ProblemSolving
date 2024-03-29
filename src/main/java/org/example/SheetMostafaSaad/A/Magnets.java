package org.example.SheetMostafaSaad.A;

import java.io.*;
import java.util.StringTokenizer;
//https://codeforces.com/contest/344/problem/A
public class Magnets {
    public static void main(String[] args) throws IOException {
        int n = MyScanner.readInt();
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = MyScanner.readInt();
        }
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
               sum++;
            } else {
                if (arr[i] != arr[i + 1]) {
                    sum ++;
                }
            }
        }
        System.out.println(sum);
    }

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

}
