package AssuitSheet.Sheet1;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/Y
public class TheLast2Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a=scan.nextLong();
        long b=scan.nextLong();
        long c=scan.nextLong();
        long d=scan.nextLong();
        long x=((a%100)*(b%100)*(c%100)*(d%100))%100;
        System.out.println((x+"").length()==1?"0"+x:x );

    }
}
