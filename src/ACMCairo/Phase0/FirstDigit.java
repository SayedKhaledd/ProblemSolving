package ACMCairo.Phase0;

//https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/P

import java.util.*;

public class FirstDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print((n / 1000) % 2 == 0 ? "EVEN" : "ODD");


    }

}