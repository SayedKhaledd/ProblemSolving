package ACMCairo.Phase0;

//https://codeforces.com/group/MWSDmqGsZm/contest/223205/problem/A
import java.util.Scanner;

public class Add {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(sum(a, b));

    }

    public static int sum(int a, int b) {
        return a + b;
    }
}