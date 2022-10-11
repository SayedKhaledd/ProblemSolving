package LeetCode;

import java.util.*;
import java.util.Scanner;



public class Test {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> table = new Hashtable<>();

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            arr[i]=x;
            if (table.get(x) != null)
                table.put(x, table.get(x) + 1);
            else
                table.put(x, 1);
        }
        boolean check = false;
        for (int i = 0; i < table.size(); i++) {
            if (table.get(arr[i]) > 1) {
                System.out.println("true");
                check = true;
                ;
                break;
            }

        }
        if (!check)
            System.out.println(false);


//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scan.nextInt();
//        }
//        int s = 0, m = 0;
//        int check = 0;
//        for (int i = 0, j = arr.length - 1; i < arr.length && j >= 0 && !(j < i); ) {
//            if (check == 0) {
//                if (arr[i] > arr[j]) {
//                    s += arr[i];
//                    i++;
//                } else {
//                    s += arr[j];
//                    j--;
//                }
//                check = 1;
//
//            } else {
//                if (arr[i] > arr[j]) {
//                    m += arr[i];
//                    i++;
//                } else {
//                    m += arr[j];
//                    j--;
//                }
//                check = 0;
//            }
//        }
//        System.out.println(s + " " + m);
    }

    public static int[] reverseArr(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr2.length; i++, j--) {
            arr2[i] = arr[j];
        }
        return arr2;
    }

    public static int reverse(int x) {

        StringBuilder s = new StringBuilder(x + "");
        if (s.charAt(0) == '-') {
            s.delete(0, 1);
            s.reverse();
            s.insert(0, '-');
        } else if (s.charAt(0) == '+') {
            s.delete(0, 1);
            s.reverse();
            s.insert(0, '+');
        } else
            s.reverse();
        int val;
        try {
            val = Integer.parseInt(s.toString());
        } catch (Exception e) {
            val = 0;
        }
        return val;
    }

}
