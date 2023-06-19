package AssuitSheet.JuniorsPhase1Practice;
//https://codeforces.com/group/u3Ii79X3NY/contest/270796/problem/I
import java.util.Scanner;

public class ProblemI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        boolean[] freq = new boolean[n + 1];
        int max = 0, top = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();

        }
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                top = max;
            }
            freq[top] = true;
            if (arr[i] != top) {
                check = true;
                break;
            }
            while (top > 0) {
                if (!freq[--top])
                    break;
            }

        }
        if (check) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
