package org.example.ACMCairo.Phase0;
//https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/N
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        String s = scan.next();
        Pattern p = Pattern.compile("\\d{"+a+"}"+"-"+"\\d{"+b+"}");
        Matcher m = p.matcher(s);
        boolean bool = m.matches();
        System.out.println(bool?"Yes":"No");
    }
}
