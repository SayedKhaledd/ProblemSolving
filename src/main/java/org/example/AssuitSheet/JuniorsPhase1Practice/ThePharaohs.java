package org.example.AssuitSheet.JuniorsPhase1Practice;

import java.io.*;
import java.util.StringTokenizer;
/*
* not yet
* 
* */
//https://codeforces.com/group/u3Ii79X3NY/contest/272628/problem/C?fbclid=IwAR3e89kDTu8bhK5-m5gLg-JLzqe1STUWnsRLI94s6Zu3jE-asoifpJGqGyY
public class ThePharaohs {
    public static void main(String[] args) throws IOException {
        int t = MyScanner.readInt();
        while (t-- > 0) {
            long n = MyScanner.readLong();
            long counter = 0;
            for (int i = 0; i < n; ) {
                counter++;

                for (long j = 0; j < counter && i < n; j++) {
                    i++;
                }

            }
            System.out.println(counter);
        }
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
