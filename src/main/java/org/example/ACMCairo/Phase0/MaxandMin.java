package ACMCairo.Phase0;

import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/K
public class MaxandMin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[3];
        int max = 0, min = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = scan.nextInt();
            if (i == 0) {
                max = arr[i];
                min = max;
            }

            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];


        }
        System.out.println(min + " " + max);

    }
}
