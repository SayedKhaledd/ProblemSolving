package org.example.ACMCairo.Phase0;
//https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/L

import java.util.Arrays;
import java.util.Scanner;


public class StringFunctions {
    public static void main(String[] args) {
        StringBuilder s;
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int q = scan.nextInt();
        s = new StringBuilder(scan.next());
        while (q-- > 0) {
            String sq = scan.next();
            switch (sq) {
                case "pop_back":
                    pop_back(s);
                    break;
                case "front":
                    front(s);
                    break;
                case "back":
                    back(s);
                    break;
                case "sort":
                    int l = scan.nextInt();
                    int r = scan.nextInt();
                    sort(s, l, r);
                    break;
                case "reverse":
                    l = scan.nextInt();
                    r = scan.nextInt();
                    reverse(s, l, r);
                    break;
                case "print":
                    int pos = scan.nextInt();
                    print(s, pos);
                    break;
                case "substr":
                    l = scan.nextInt();
                    r = scan.nextInt();
                    substr(s, l, r);
                    break;
                case "push_back":
                    char x = scan.next().charAt(0);
                    push_back(s, x);
                    break;


            }


        }

    }

    public static void pop_back(StringBuilder s) {
        s.deleteCharAt(s.length() - 1);
    }

    public static void front(StringBuilder s) {
        System.out.println(s.charAt(0));
    }


    public static void back(StringBuilder s) {
        System.out.println(s.charAt(s.length() - 1));
    }

    public static void reverse(StringBuilder s, int l, int r) {
     if(l>r){
         int temp=l;
         l=r;
         r=temp;

     }
     l--;

        StringBuilder stringBuilder = new StringBuilder(s.substring(l, r));
        stringBuilder.reverse();
        s.replace(l, r, stringBuilder.toString());
//
//        char[] chars = s.substring(l, r).toCharArray();
//        StringBuilder string = new StringBuilder("");
//        for (int i = chars.length - 1; i >= 0; i--) {
//            string.append(chars[i]);
//
//        }
//        s.replace(l, r, string.toString());
    }

    public static void sort(StringBuilder s, int l, int r) {
        if(l>r){
            int temp=l;
            l=r;
            r=temp;

        }
        l--;

        char[] chars = s.substring(l, r).toCharArray();
        Arrays.sort(chars);
        StringBuilder string = new StringBuilder("");
        for (char aChar : chars) {
            string.append(aChar);

        }
        s.replace(l, r, string.toString());
    }

    public static void print(StringBuilder s, int pos) {
        System.out.println(s.charAt(pos - 1));
    }

    public static void substr(StringBuilder s, int l, int r) {
        if(l>r){
            int temp=l;
            l=r;
            r=temp;

        }
        l--;
        System.out.println(s.substring(l, r));
    }

    public static void push_back(StringBuilder s, char x) {
        s.append(x);
    }


}
