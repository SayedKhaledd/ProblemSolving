package SheetMostafaSaad.A;

import java.util.Scanner;

//https://codeforces.com/contest/677/problem/A
public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int h = scan.nextInt();
        int min_width = 0;
        while (n-- > 0) {
            int x = scan.nextInt();
            min_width += x <= h ? 1 : 2;
        }
        System.out.println(min_width);
    }
}
