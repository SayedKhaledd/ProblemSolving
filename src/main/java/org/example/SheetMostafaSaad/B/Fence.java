package org.example.SheetMostafaSaad.B;

import java.io.*;
import java.util.StringTokenizer;

//https://codeforces.com/contest/363/problem/B
public class Fence {
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

        public static void print(String s) {
            pt.write(s);
            pt.close();
        }

        public static void print(int i) {
            print(i + "");
        }

        public static void print(long i) {
            print(i + "");
        }

        public static void print(double i) {
            print(i + "");

        }

        public static void print(char c) {
            print(c + "");
        }
    }

    public static void main(String[] args) throws IOException {
        MyScanner scan = new MyScanner();
        int n = scan.readInt();
        int k = scan.readInt();
        int[] arr = new int[n];
        int[] prefixSum = new int[n];

        arr[0] = scan.readInt();
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i] = scan.readInt();
            prefixSum[i] = arr[i] + prefixSum[i - 1];
        }
        int min = 0, minIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i - k >= 0 && prefixSum[i] - prefixSum[i - k] < min) {
                min = prefixSum[i] - prefixSum[i - k];
                minIndex=i;
            }

            else if (i == k - 1){
                min = prefixSum[i];
                minIndex=i;
            }

        }
        scan.print(minIndex-k+2);

    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min && arr[i] != 0) {
                min = arr[i];
                index = i;
            }

        }
        return index;
    }

}
