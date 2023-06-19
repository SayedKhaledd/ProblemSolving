package org.example.ACMCairo.Phase0;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/F
public class PrintEvenIndices {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=scanner.nextInt();

        for(int i= arr.length-1;i>=0;i--)
            if(i%2==0)
            System.out.print(arr[i]+" ");
    }
}
