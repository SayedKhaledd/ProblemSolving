package AssuitSheet.NewComers.Sheet3;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/O
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] fib = new long[n];
        fib[0] = 0;
        if(n>1)
        fib[1] =1;
        if(n>2)
        for(int i=2;i<n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        System.out.println(fib[n-1]);
    }
}
