import java.util.Scanner;


//https://codeforces.com/problemset/problem/1/A?fbclid=IwAR39SJ4YVkdJLOt9_9oeOUpBy9Gl31MEJO4b6ow4oaMC4zxW6NZyR2aYOHc#
public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();
        long a = scan.nextLong();


        System.out.println((long) (Math.ceil(m / (double) a) * Math.ceil(n / (double) a)));
    }
}
