import java.util.Scanner;

//https://codeforces.com/contest/1530/problem/A
public class BinaryDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            //matches the case
            if ((n+"").matches("[0-1]+")) {
                System.out.println(1);
            }
            //smaller than 10
            else if (n < 10) {
                System.out.println(n);
            } else {
                for(int i=9;i>=2;i--)
                if ((n+"").contains(i+"")) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
