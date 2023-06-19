package org.example.ACMCairo.Phase0;
//https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/W

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MathematicalExpression {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
Scanner scan=new Scanner(System.in);
int a,b,c;
char s,q;
a=scan.nextInt();
s=scan.next().charAt(0);
b=scan.nextInt();

q=scan.next().charAt(0);
c=scan.nextInt();


       // System.out.println(a+" "+s+" "+b+" "+q+" "+c);
        switch (s) {
            case '+':
                if (a + b == c)
                    System.out.println("Yes");
                else System.out.println(a + b);
                break;
            case '-':
                if (a - b == c) System.out.println("Yes");
                else System.out.println(a - b);
                break;
            case '*':
                if (a * b == c) System.out.println("Yes");
                else System.out.println(a * b);
                break;
            case '/':
                if (a / b == c) System.out.println("Yes");
                else System.out.println(a / b);
                break;


        }

    }
}
