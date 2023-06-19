package org.example.ACMCairo.Phase0;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/Y
public class EasyFibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arrfib=new int[n];
        arrfib[0]=0;
        if(n>1)arrfib[1]=1;
        for(int i=0;i<n;i++) {
              if(i>1){
                   arrfib[i]=arrfib[i-1]+arrfib[i-2];

               }
            System.out.print(arrfib[i]+" ");


        }
    }

}
