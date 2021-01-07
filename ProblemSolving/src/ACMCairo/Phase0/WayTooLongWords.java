package ACMCairo.Phase0;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/F
public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        while (n-->0){
        String s=scan.next();
            System.out.println(s.length()>10?s.charAt(0)+""+(s.length()-2)+""+s.charAt(s.length()-1):s);

        }

    }
}
