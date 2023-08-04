package org.example.Codeforces;


import org.example.Library.MyScanner;

import java.io.IOException;

//https://codeforces.com/problemset/gymProblem/101532/D?fbclid=IwAR10GtsqHMnr722UcOBntf7BuVGsfReqiZSREYLZ_HsWX6OaL7vzIssQhsI
public class CountingTest {


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
