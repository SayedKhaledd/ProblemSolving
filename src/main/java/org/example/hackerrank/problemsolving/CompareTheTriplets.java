package org.example.hackerrank.problemsolving;
//https://www.hackerrank.com/challenges/compare-the-triplets/problem

import java.io.IOException;
import java.util.Scanner;

public class CompareTheTriplets {

    // Complete the compareTriplets function below.
    static int[] compareTriplets(int[] a, int[] b) {
        int[] c=new int[2];
        int counter1=0,counter2=0;
        for(int i=0;i<3;i++){
            if(a[i]>b[i])
                counter1++;
            else if(a[i]<b[i]){
                counter2++;


            }
        }
        c[0]=counter1;
        c[1]=counter2;
        return c;
    }

    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];

        for(int i=0;i<3;i++){
            a[i]=scan.nextInt();
        }
        for(int j=0;j<3;j++){
            b[j]=scan.nextInt();

        }
        int c[]=compareTriplets(a,b);
        System.out.print(c[0]+" "+c[1]);
    }

}
