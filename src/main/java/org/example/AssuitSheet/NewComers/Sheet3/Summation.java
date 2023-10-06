package org.example.AssuitSheet.NewComers.Sheet3;


import java.util.Scanner;

public class Summation
{
    public static void main (String[] args)
    {

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        long sum=0;
        long[] a =new long[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextLong();

        }
        for(int i=0;i<n;i++){
            sum+=a[i];

        }
        System.out.print((long)Math.abs(sum));
    }
}
