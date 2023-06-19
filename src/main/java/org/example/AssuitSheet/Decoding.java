package AssuitSheet;

import java.io.*;
import java.util.StringTokenizer;

public class Decoding {
    public static void main(String[] args) throws IOException {
        int n = MyScanner.readInt();
        String s = MyScanner.readLine();

        if (s.length() == 1 || s.length() == 2)
            System.out.println(s);
        else if (s.length() == 3) {
            System.out.println(s.charAt(1)+"" + s.charAt(0) +""+ s.charAt(2));
        } else if (s.length() == 4) {
            System.out.println(s.charAt(2) +""+ s.charAt(0)+"" + s.charAt(1)+"" + s.charAt(3));
        } else {
            StringBuilder org = new StringBuilder(s);
            StringBuilder ss = new StringBuilder("");
            ss.append(org.charAt(0));
            org.deleteCharAt(0);
            for (int i = 0; i < org.length(); ) {

              //  System.out.println(org.length());
                if (org.length() % 2 == 0) {
              //      System.out.println("here");
                    ss.insert(0, org.charAt(i));
                } else {
               //     System.out.println("here2");
                    ss.append(org.charAt(i));
                }
                org.deleteCharAt(i);
                //System.out.println(ss);

            }
            System.out.println(ss);
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
