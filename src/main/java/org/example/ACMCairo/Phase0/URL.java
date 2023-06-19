package org.example.ACMCairo.Phase0;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/T
public class URL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        final String USERNAME = "username", PROFILE = "profile", PWD = "pwd", KEY = "key", ROLE = "role";

        String username = s.substring(s.indexOf(USERNAME) + 9, s.indexOf(PWD) - 1);
        String pwd = s.substring(s.indexOf(PWD) + 4, s.indexOf(PROFILE) - 1);
        String profile = s.substring(s.indexOf(PROFILE) + 8, s.indexOf(ROLE) - 1);
        String role = s.substring(s.indexOf(ROLE) + 5, s.indexOf(KEY) -1);
        String key = s.substring(s.indexOf(KEY) + 4, s.length());

        System.out.println("username: "+username+"\npwd: "+pwd+"\nprofile: "+profile+"\nrole: "+role+"\nkey: "+key);



    }
}
