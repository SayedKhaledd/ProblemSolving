package leetcode;

import java.util.Scanner;
import java.util.function.Function;

public class test {
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


    public static void main(String[] args) {
//        long[][] arr = new long[100][100];
//        arr[0][0] = 1;
//        long getLastValue = 1, getLastCount = 1;
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 0; j < getLastCount + 1; j++) {
//                if (j == 0) {
//                    arr[i][j] = getLastValue + 1;
//                } else {
//                    arr[i][j] = arr[i][j - 1] + 1;
//
//                    if (j == getLastCount) {
//                        getLastValue = arr[i][j];
//
//                    }
//                }
//
//            }
//            getLastCount++;
//        }
//        System.out.println("Last value is " + getLastValue);
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == 0)
//                    break;
//                System.out.print(arr[i][j] + " ");
//
//            }
//            System.out.println();
//        }


        System.out.println(add.apply(2));
        System.out.println(execute(2));
    }
}
