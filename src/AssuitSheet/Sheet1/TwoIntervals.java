package AssuitSheet.Sheet1;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/X
public class TwoIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l1 = scan.nextInt();
        int r1 = scan.nextInt();
        int l2 = scan.nextInt();
        int r2 = scan.nextInt();
        if ((l1 < l2 && r1 < l2) || (l1 > r2 && r1 > r2)) {
            System.out.println(-1);
        } else if (l2 >= l1 && r2 <= r1) {
            System.out.println(l2 + " " + r2);
        } else if (l2 <= l1 && r2 >= r1) {
            System.out.println(l1 + " " + r1);
        } else if (l2 <= r1 && r2 >= r1) {
            System.out.println(l2 + " " + r1);
        } else if (l1 <= r2 && r2 <= r1) {
            System.out.println(l1 + " " + r2);
        }


    }
}
