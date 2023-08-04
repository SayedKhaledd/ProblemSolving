package org.example.AssuitSheet;

import java.util.Scanner;

public class SimpleMod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = 1, s = 3;
        while (s < n && t < n) {
            if ((s * s + t * t) / 2.0 % n == 0 && gcd(t, s) == 1 && s > t) {
                int a = s * t;
                int b = (s * s - t * t) / 2;
                System.out.println(a + " " + b);
                break;
            } else {
                s++;

            }
            if (s >= n) {
                System.out.println("ues");
                t++;
                s = 1;
            }

        }

    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
