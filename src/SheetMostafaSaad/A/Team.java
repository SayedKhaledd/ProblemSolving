package SheetMostafaSaad.A;

import java.util.Scanner;

//https://codeforces.com/contest/231/problem/A
public class Team {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter = 0;
        while (n-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if (a + b + c >= 2) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
