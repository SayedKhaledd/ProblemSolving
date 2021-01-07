package ACMCairo.Phase0;

import java.util.ArrayList;
import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/223205/problem/O
public class FiveInOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)arr[i]= scan.nextInt();
        int max = getMax(arr);
        int min = getMin(arr);
        int numberOfPrimes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) numberOfPrimes++;
        }
        int numberOfPlad = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPlad(arr[i])) numberOfPlad++;
        }

        int[] fre = numberOfDividor(arr);
        ArrayList<Integer> v = maxNumberOfDiv(arr, fre);
        int d = getMax(v);

        System.out.println("The maximum number : "+ max+"\n" +
                "The minimum number : "+min+"\n" +
                "The number of prime numbers : "+numberOfPrimes+"\n" +
                "The number of palindrome numbers : "+numberOfPlad+"\n" +
                "The number that has the maximum number of divisors : "+d+"\n");
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];

        }
        return max;
    }

    public static int getMax(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) max = arr.get(i);

        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];

        }
        return min;
    }

    public static boolean isPlad(int x) {
        String c = x + "";
        for (int i = 0, j = c.length() - 1; i < c.length() / 2; i++, j--) {
            if (c.charAt(i) != c.charAt(j)) {
                return false;

            }
        }
        return true;
    }

    public static boolean isPrime(int value) {
        if(value==1)return false;
        int n = value - 1;
        while (n != 1) {
            if (value % n == 0) return false;
            n--;

        }
        return true;

    }


    public static int[] numberOfDividor(int arr[]) {
        int[] counter = new int[arr.length];

        for (int i = 0; i < counter.length; i++) {
            int count = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) count++;

            }
            counter[i] = count;
        }
        return counter;
    }

    public static ArrayList<Integer> maxNumberOfDiv(int[] org, int[] arr) {
        int x = getMax(arr);
        ArrayList<Integer> fre = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) fre.add(org[i]);

        }

        return fre;
    }

}
