package org.example.ACMCairo.Phase1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr =new int[n];

        for(int i=0;i< arr.length;i++){
            arr[i]= scan.nextInt();

            }
        int counter=1;
        Arrays.sort(arr);
       for(int i=1;i<n;i++){
           if(arr[i]!=arr[i-1])counter++;
       }
        System.out.println(counter);


    }
}
