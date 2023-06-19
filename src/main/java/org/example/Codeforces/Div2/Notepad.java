package org.example.Codeforces.Div2;

import java.util.Scanner;
/*
* not yet
* */
//https://codeforces.com/contest/1766/problem/B
public class Notepad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int[] freq = new int[26];
            int counter = 0;
            int index = -1;
            boolean check = false;
            for (int i = 0; i < n; i++) {
                if (++freq[s.charAt(i) - 97] >= 2) {
                    counter++;
                    if (index == -1)
                        index = i;
                    else if (i == index + 1 && i < n - 2) {
                        check = true;
                        break;
                    } else {
                        index = -1;
                    }
                }

            }
//            if (counter >= 2)
//                System.out.println("yes");
//            else
//                System.out.println("NO");
            if (check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
