package org.example.ACMCairo.Phase0;

//https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/D

import java.util.Scanner;

public class FixedPassword {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        while (a != 1999) {
            System.out.println("Wrong");
            a = scan.nextLong();

        }

        System.out.println("Correct");


    }
}