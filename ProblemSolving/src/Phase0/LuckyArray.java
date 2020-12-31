package Phase0;
//https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/J

import java.util.Scanner;

public class LuckyArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int counter = 1, smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                counter = 1;
            } else if (arr[i] == smallest) {
                counter++;

            }


        }
        System.out.println(counter % 2 != 0 ? "Lucky" : "Unlucky");


    }
}
