package Codeforces.Div4;
//https://codeforces.com/contest/1791/problem/A
import java.util.Scanner;

public class CodeforcesChecking {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        final String TEST="codeforces";
        while (t-- > 0) {
            String s = scan.next();
            char c = s.charAt(0);
            if(TEST.indexOf(c)>=0)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }


}
