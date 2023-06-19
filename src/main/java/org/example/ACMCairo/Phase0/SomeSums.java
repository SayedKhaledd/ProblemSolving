package org.example.ACMCairo.Phase0;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/U
public class SomeSums {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){

            int x= sumOfDigits(i);
           // System.out.println(x);
             if(x>=a && x<=b){

                 sum+=i;
                 //System.out.println(i);
             }

        }
        System.out.println(sum);
    }

public static int sumOfDigits(int n){
        int sum=0;
        int length=(n+"").length();
        for(int i=0;i<length;i++){
            sum+=n%10;
            n/=10;
        }
        return sum;

}

}
