package org.example.ACMCairo.Phase0;
//https://codeforces.com/group/MWSDmqGsZm/contest/223338/problem/R
import java.util.Scanner;

public class DistancePoints {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x1= scan.nextInt();
        int y1= scan.nextInt();
        int x2= scan.nextInt();
        int y2= scan.nextInt();

        double dis=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.println(dis);
    }
}
