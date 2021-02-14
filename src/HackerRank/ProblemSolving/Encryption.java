package HackerRank.ProblemSolving;
//https://www.hackerrank.com/challenges/encryption/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Encryption {

    // Complete the encryption function below.
    static String encryption(String s) {
        int rows = (int) Math.floor(Math.pow(s.length(), 0.5));
        int columns = (int) Math.ceil(Math.pow(s.length(), 0.5));
        StringBuilder x = new StringBuilder("");
        if (rows * columns < s.length()) {
            if (rows < columns) rows++;
            else columns++;
        }
      /*  for(int i=0,k=0;i<rows&&k<s.length();i++){
            for(int j=0;j<columns&&k<s.length();j++,k++){
                x.append(s.charAt(k));
            }
            x.append(" ");
        }*/
        int h = 0;
        for (int i = 0, k = 0; i < columns && k < s.length(); i++) {
            h = i;
            for (int j = 0; j < rows && k < s.length() && h < s.length(); j++, k++) {
                x.append(s.charAt(h));
                h += columns;
            }
            x.append(" ");
        }
        return x.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
