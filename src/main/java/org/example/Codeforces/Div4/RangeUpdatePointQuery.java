package Codeforces.Div4;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/***
 * not yet
 */
//https://codeforces.com/contest/1791/problem/F
public class RangeUpdatePointQuery {
    public static void main(String[] args) throws IOException {

        int t = MyScanner.readInt();
        while (t-- > 0) {
            int n = MyScanner.readInt();
            int q = MyScanner.readInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = MyScanner.readInt();
            }
            for (int i = 0; i < q; i++) {
                int id = MyScanner.readInt();
                if (id == 1) {
                    int l = MyScanner.readInt();
                    int r = MyScanner.readInt();
                    for (int j = l - 1; j < r; j++) {
                        arr[j] = sumOfDigits(arr[j]);
                    }
                } else {
                    int x = MyScanner.readInt();
                    System.out.println(arr[x - 1]);
                }
            }
        }
    }

    public static int sumOfDigits(int n) {

        int sum = 0;
        while (n > 0) {
            int x = n % 10;
            sum += x;
            n /= 10;
        }
        return sum;
    }

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

}
