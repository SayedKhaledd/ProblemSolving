package org.example.SheetMostafaSaad.A;
//https://codeforces.com/contest/734/problem/A
import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int anton_wins = 0, danik_wins = 0;
        for (char c :
                s.toCharArray()) {
            if (c == 'A')
                anton_wins++;
            else
                danik_wins++;
        }
        System.out.println(anton_wins > danik_wins ? "Anton" : danik_wins > anton_wins ? "Danik" : "Friendship");
    }
}
