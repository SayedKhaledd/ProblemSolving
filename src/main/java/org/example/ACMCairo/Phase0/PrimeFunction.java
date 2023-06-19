package org.example.ACMCairo.Phase0;


import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/223205/problem/D
public class PrimeFunction {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            int x= scan.nextInt();
            System.out.println(isprime(x)?"YES":"NO");

        }
    }
    public static boolean isprime(int n) {
if(n==1)return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;

        }

        return true;

    }
}
