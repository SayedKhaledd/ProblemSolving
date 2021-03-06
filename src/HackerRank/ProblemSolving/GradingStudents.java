package HackerRank.ProblemSolving;
//https://www.hackerrank.com/challenges/grading/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class GradingStudents {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            if (x < 40 && x + (5 - x % 5) < 40) {
                System.out.println(x);
            } else {
                if (x % 5 >= 3)
                    System.out.println(x + (5 - x % 5));
                else {
                    System.out.println(x);

                }
            }

        }
    }
}

