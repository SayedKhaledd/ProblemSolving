package org.example.ACMCairo.Phase0;
//https://codeforces.com/group/MWSDmqGsZm/contest/223338/problem/D

import java.util.Scanner;


public class Xor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long q = scan.nextLong();

        if (q == 1) System.out.println(a);
        else if (q == 2) System.out.println(b);
        else {
            if (q % 3 == 0) System.out.println(b ^ a);
            else if (q % 3 == 1) System.out.println(a);
            else System.out.println(b);

        }


    }


}
