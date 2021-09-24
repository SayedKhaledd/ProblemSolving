package AssuitSheet.Sheet4;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/C
public class Compare {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=scan.next();
        String b=scan.next();
        System.out.println(a.compareTo(b)<0?a:b);
    }
}
