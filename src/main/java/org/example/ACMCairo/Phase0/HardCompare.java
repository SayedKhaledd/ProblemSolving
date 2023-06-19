package ACMCairo.Phase0;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/Z
public class HardCompare {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long a= scan.nextLong();
        long b=scan.nextLong();
        long c=scan.nextLong();
        long d=scan.nextLong();
        if(b*Math.log(a)>d*Math.log(c)) System.out.println("YES");
        else System.out.println("NO");

    }
}
