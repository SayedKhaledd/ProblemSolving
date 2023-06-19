package org.example.HackerRank.ProblemSolving;
//https://www.hackerrank.com/challenges/diagonal-difference/problem
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



public class DiagonalDifference {
    public static int diagonalDifference(int[][] arr) {
        // Write your code here
        int a=0,b=0;


        for(int j=0,i=0;j<arr.length;j++,i++){
            if(i==j){
                a+=arr[i][j];
            }


        }


        for(int j=arr.length-1,i=0;j>=0;j--,i++){

            b+=arr[i][j];



        }
        return (int)Math.abs(a-b);
    }
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=scan.nextInt();
            }

        }

        int c=diagonalDifference(a);
        System.out.print(c);
    }
}
