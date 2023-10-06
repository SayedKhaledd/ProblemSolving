package org.example.hackerrank.problemsolving;
//https://www.hackerrank.com/challenges/diagonal-difference/problem

import java.io.IOException;
import java.util.Scanner;


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
