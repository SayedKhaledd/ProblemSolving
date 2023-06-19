package org.example.SheetMostafaSaad.A;

import java.io.*;
import java.util.StringTokenizer;

//https://codeforces.com/contest/236/problem/A
public class BoyOrGirl {

    private static class MyScanner {
        static StringTokenizer st;
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        static PrintWriter pt = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        public static String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(reader.readLine().trim());
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
        MyScanner scan = new MyScanner();
        String s = scan.readLine();
        int[] freq = new int[26];
        int counter = 0;
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 97]++;

        for (int i = 0; i < 26; i++)
            if (freq[i] >= 1)
                counter++;

        if (counter % 2 == 0) {
            scan.pt.write("CHAT WITH HER!");
        } else
            scan.pt.write("IGNORE HIM!");
        scan.pt.close();
    }

}


