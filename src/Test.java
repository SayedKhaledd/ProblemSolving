import java.io.*;
import java.util.*;

public class Test {
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
        int t = scan.readInt();
        while (t-- > 0) {
            long n = scan.readLong();
            int x = getDivisors(n).size();
            if (x == 3)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

    }

    public static List<Long> getDivisors(long n) {
        ArrayList<Long> arr = new ArrayList<>();
        if (n == 1) {
            arr.add(1l);
            return arr;
        }
        while (n % 2 == 0) {
            n /= 2;
            arr.add(2l);
            if (arr.size() >= 3)
                break;
        }
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (arr.size() >= 3)
                break;
            while (n % i == 0) {
                n /= i;
                arr.add(i);
                if (arr.size() >= 3)
                    break;
            }
            if (arr.size() >= 3)
                break;

        }
        if (n > 2)
            arr.add(n);
        if (n == 1)
            arr.add(1l);
        return arr;
    }

}

class Solution {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
//        int n= scan.nextInt();
        String[] strs={"a","b","a","a"};
//        for(int i=0;i<n;i++)
//            strs[i]= scan.next();
//        ArrayList<String> in= new ArrayList<>();
//        Collections.addAll(in, strs);
//        in.remove(2);
//        System.out.println(in);
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> arrs = new ArrayList<>();
        ArrayList<String> in= new ArrayList<>();
        Collections.addAll(in, strs);

        for (int i = 0; i < in.size(); i++) {
            arrs.add(new ArrayList<>());
            arrs.get(i).add(in.get(i));
            System.out.println("the input is like that");
            System.out.println(in);
            System.out.println("i is "+ i+ " and the value is "+in.get(i));

            for(int j=i+1;j<in.size();j++){
                if(isAnagram(in.get(i),in.get(j))){
                    arrs.get(i).add(in.get(j));
                    System.out.println("remove "+ in.get(j)+" in position "+j);
                   in.remove(in.lastIndexOf(in.get(j)));
                    j--;
                }

            }
            System.out.println("now the input is like that");
            System.out.println(in);
            System.out.println("and the output is like that");

            System.out.println(arrs);
        }
        return arrs;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] freq = new char[26];
        char[] freq2 = new char[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < t.length(); i++) {
            freq2[t.charAt(i) - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != freq2[i])
                return false;
        }
        return true;


    }
}
