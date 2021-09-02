import java.io.File;
import java.sql.SQLOutput;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();

        }
        boolean check = false;
        for (int i = 0; i < n; i++) {
            int index = Arrays.binarySearch(arr, 0, arr.length - 1, x - arr[i]);
            if (index != i && index>=0) {
                System.out.println("YES");
                check = true;
                break;
            }

        }
        if (!check)
            System.out.println("NO");

    }
}
