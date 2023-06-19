package org.example.Codeforces.ITMO.binarysearch;


import java.io.*;
import java.util.StringTokenizer;


public class BinarySearch {
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
        int n = MyScanner.readInt();
        int q = MyScanner.readInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = MyScanner.readInt();
        }

        int high, low;
        for (int i = 0; i < q; i++) {

            int x = MyScanner.readInt();
            high = n - 1;
            low = 0;
            boolean check = false;
            while (low <= high) {
                int mid = (high + low) / 2;
                if (x == arr[high]) {
                    System.out.println("YES");
                    check = true;
                    break;
                } else if (x == arr[low]) {
                    System.out.println("YES");
                    check = true;
                    break;
                }

                if (arr[mid] == x) {
                    System.out.println("YES");
                    check = true;
                    break;
                } else if (arr[mid] > x) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            if (!check)
                System.out.println("NO");


        }

    }
}
