package AssuitSheet.NewComers.Sheet10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * not yet
 */
public class HussienandStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        char[] aArr = a.toCharArray();
        String b = scan.next();
        char[] bArr = b.toCharArray();

        Arrays.sort(aArr);
        Arrays.sort(bArr);
        String newA = String.copyValueOf(aArr);
        String newB = String.copyValueOf(bArr);

        System.out.println(newA.equals(newB) ? "YES" : "NO");


    }
}
