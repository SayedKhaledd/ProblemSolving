package org.example.HackerRank.ProblemSolving;
//https://www.hackerrank.com/challenges/bigger-is-greater/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BiggerIsGreater {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
        char[] chars = w.toCharArray();
        boolean check = false;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (i > 0 && chars[i] > chars[i - 1]) {
                if (i == chars.length - 1) {
                    char k = chars[i];
                    chars[i] = chars[i - 1];
                    chars[i - 1] = k;
                } else {
                    int smallestindex = 0;

                    for (int j = i + 1; j < chars.length; j++) {
                        if (chars[j] > chars[i - 1] && chars[j] < chars[i]) {
                            smallestindex = j;
                            System.out.println(j);
                        }


                    }
                    char temp;
                    if (smallestindex != 0) {
                        temp = chars[smallestindex];
                        chars[smallestindex] = chars[i - 1];
                    } else {
                        temp = chars[i];
                        chars[i] = chars[i - 1];

                    }
                    chars[i - 1] = temp;
                    char[] tt = new char[chars.length - i];
                    for (int l = 0, h = i; l < tt.length; l++, h++) {
                        tt[l] = chars[h];
                        System.out.println(chars[h]);
                    }
                    Arrays.sort(tt);
                    for (int l = 0, h = i; l < tt.length; l++, h++) {
                        chars[h] = tt[l];
                        System.out.println(chars[h]);

                    }
                }
                check = true;
                break;
            }

        }
        return check ? new String(chars) : "no answer";

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
