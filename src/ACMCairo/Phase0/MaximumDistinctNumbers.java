package ACMCairo.Phase0;


import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/223338/problem/E
public class MaximumDistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        double r1 = (-2 + Math.sqrt(4 - 4 * -2 * n)) / (2.0);
        double r2 = (-2 - Math.sqrt(4 - 4 * -2 * n)) / (2.0);
        System.out.println(r1 < 0 ? (int) Math.round(r2) : (int) Math.round(r1));

    }
}
