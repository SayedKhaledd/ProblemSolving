package org.example.hackerrank.problemsolving;
//https://www.hackerrank.com/challenges/reduced-string/problem

import java.io.*;

public class SuperReducedString {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        StringBuilder ss = new StringBuilder(s);
        while (ss.length() != 0) {
            boolean check = false;
            for (int i = 0; i < ss.length(); i++) {
                if ((i + 1) != ss.length() && ss.charAt(i) == ss.charAt(i + 1)) {
                    ss.deleteCharAt(i);
                    ss.deleteCharAt(i);
                    check = true;

                }

            }
            if (!check) break;

        }
        return ss.toString().equals("") ? "Empty String" : ss.toString();

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

