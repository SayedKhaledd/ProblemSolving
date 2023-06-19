package org.example.AssuitSheet.NewComers.Sheet2;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/M
public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        boolean check=false;
       for(int i=a;i<=b;i++){
           String s=i+"";
           if(s.matches("[4|7]+")){
               System.out.print(i+" ");
               check=true;
           }

       }
       if(!check)
           System.out.print(-1);

    }
}
