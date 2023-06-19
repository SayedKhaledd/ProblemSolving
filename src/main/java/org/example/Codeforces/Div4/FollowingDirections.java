package Codeforces.Div4;

import java.util.Scanner;
////https://codeforces.com/contest/1791/problem/b
public class FollowingDirections {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int x, y;
        boolean check;
        while (t-- > 0) {
            x = 0;
            y = 0;
            int n=scan.nextInt();
            String direction = scan.next();
            check = false;
            for (int i = 0; i < direction.length(); i++) {
                switch (direction.charAt(i)) {
                    case 'U':
                        y++;
                        break;
                    case 'R':
                        x++;
                        break;
                    case 'L':
                        x--;
                        break;
                    case 'D':
                        y--;
                        break;
                }
                if (x == 1 && y == 1) {
                    check = true;
                    break;
                }
            }
            if(check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
