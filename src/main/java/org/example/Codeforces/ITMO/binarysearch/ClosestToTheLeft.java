package org.example.Codeforces.ITMO.binarysearch;

import java.io.*;
import java.util.StringTokenizer;

public class ClosestToTheLeft {
    public static void main(String[] args) throws IOException {
        int n = MyScanner.readInt();
        int q = MyScanner.readInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = MyScanner.readInt();
        }
        int high, low, mid;
        for (int i = 0; i < q; i++) {
            int x = MyScanner.readInt();
            if (arr[0] > x) {
                System.out.println(0);
                continue;
            } else if (arr[arr.length - 1] < x) {
                System.out.println(n);
                continue;
            }
            low = 0;
            high = n - 1;
            boolean check = false;
            while (low + 1 < high) {
                mid = (high + low) / 2;
                if (x == arr[high]) {
                    System.out.println(high + 1);
                    check = true;
                    break;
                } else if (x == arr[low]) {
                    System.out.println(low + 1);
                    check = true;
                    break;
                }

                if (arr[mid] == x) {
                    System.out.println(mid + 1);
                    check = true;
                    break;
                }


                if (arr[mid] > x) {
                    high = mid;

                } else {
                    low = mid;
                }
            }
            if (!check)
                System.out.println(low + 1);


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
