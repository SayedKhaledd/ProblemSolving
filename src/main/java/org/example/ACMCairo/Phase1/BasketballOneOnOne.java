package org.example.ACMCairo.Phase1;

import java.util.Scanner;

//https://open.kattis.com/contests/mcpc19open/problems/basketballoneonone
public class BasketballOneOnOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int aScore = 0, bScore = 0;
        char current=' ';
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c=='A'){
                current='A';
            }
            else if(c=='B'){
                current='B';
            }
            else {
                if(current=='A')
                    aScore+=(c-48);
                else if(current=='B')
                    bScore+=(c-48);


            }


        }
        System.out.println(aScore>bScore?'A':'B');

    }
}
