import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] freq = new int[26];
        int n = scan.nextInt();
        String s = scan.next();
        for (int i = 0; i < s.length(); i++) {
            freq[(int) (s.charAt(i) - 'a')]++;

        }
        for (int i = 0; i < 26; i++) {
            int x = freq[i];
            for (int j = 0; j < x; j++) {
                System.out.print((char) ('a' + i));
            }
        }
    }


}
