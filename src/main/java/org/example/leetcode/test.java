package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class test {
    public static void main(String[] args) {
//        rearrange(Arrays.asList(1, 2, 3, 4)).forEach(System.out::println);
        System.out.println(countTeams(Arrays.asList(12, 4, 6, 13, 5, 10), 3, 4, 10));
        System.out.println(countTeams(Arrays.asList(4, 8, 5, 6), 1, 5, 7));
        System.out.println(countTeams(Arrays.asList(6, 4, 8, 7, 5, 2), 2, 3, 10));

    }

    public static int countTeams(List<Integer> skills, int minPlayers, int minLevel, int maxLevel) {
        skills.sort(Integer::compareTo);
        int qualified = 0;
        for (int i = 0; i < skills.size(); i++) {
            if (skills.get(i) >= minLevel && skills.get(i) <= maxLevel)
                qualified++;
            if (skills.get(i) > maxLevel)
                break;
        }
//        System.out.println("qualified is " + qualified);
//        System.out.println("min players is " + minPlayers);

        int comb = combination(qualified, minPlayers);
        int fac = minPlayers;
        fac++;

//        System.out.println(comb);
        while (fac != qualified + 1) {
//            System.out.println("qualified is " + qualified + "while fac is " + fac);
            comb += combination(qualified, fac);
            fac++;
//            System.out.println(comb);

        }
        return comb;
    }

    static int factorial(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }

    static int combination(int n, int r) {
        return (int) (factorial(n) / ((double) factorial(r) * factorial(n - r)));
    }

    public static List<Integer> rearrange(List<Integer> arr) {
        List<Integer> arr2 = new ArrayList<>(arr);
        arr2.sort(Integer::compareTo);
        int counter = 0;
        for (int i = 0, k = 0, j = 0; i < arr.size(); i++) {

            if (counter < 1) {
                arr.set(i, arr2.get(arr.size() - 1 - k));
                k++;
            } else {
                arr.set(i, arr2.get(j));
                j++;


            }
            if (i != 0)
                counter = counter >= 1 ? 0 : counter + 1;
        }


        return arr;
    }

    static Function<Integer, Integer> add = x -> {
        return x + 2;
    };
    static Function<Integer, Integer> multiply = x -> {
        return x * 2;
    };
    static Function<Integer, Integer> divide = x -> {
        return x / 2;
    };

    public static Integer execute(int x) {
        Function<Integer, Integer> result = add.andThen(multiply).andThen(divide);
        return result.apply(x);
    }


//    public static void main(String[] args) {
////        long[][] arr = new long[100][100];
////        arr[0][0] = 1;
////        long getLastValue = 1, getLastCount = 1;
////        for (int i = 1; i < arr.length; i++) {
////            for (int j = 0; j < getLastCount + 1; j++) {
////                if (j == 0) {
////                    arr[i][j] = getLastValue + 1;
////                } else {
////                    arr[i][j] = arr[i][j - 1] + 1;
////
////                    if (j == getLastCount) {
////                        getLastValue = arr[i][j];
////
////                    }
////                }
////
////            }
////            getLastCount++;
////        }
////        System.out.println("Last value is " + getLastValue);
////
////        for (int i = 0; i < arr.length; i++) {
////            for (int j = 0; j < arr[i].length; j++) {
////                if (arr[i][j] == 0)
////                    break;
////                System.out.print(arr[i][j] + " ");
////
////            }
////            System.out.println();
////        }
//
//
//        System.out.println(add.apply(2));
//        System.out.println(execute(2));
//    }
}
