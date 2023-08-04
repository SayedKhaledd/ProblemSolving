package org.example.codesignal.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


//not yet
public class AlmostIncreasingSequence {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 1, 2}));
    }

    static boolean solution(int[] sequence) {
        IntStream stream = Arrays.stream(sequence);
        List<Integer> arrayList = stream.boxed().toList();

        for (int i = 1; i < sequence.length; i++) {
        }

        return false;
    }

    static boolean isIncreasingSequence(ArrayList<Integer> integers) {
//        for (var i = 0; i < sequence.length - 1; i++) {
//            if (sequence[i] >= sequence[i + 1]) {
//                return false;
//            }
//        }

        return true;
    }
}
