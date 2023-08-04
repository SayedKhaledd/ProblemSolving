package org.example.codesignal.intro;

public class MakeArrayConsecutive2 {
    int solution(int[] statues) {
        int min = getMin(statues);
        int max = getMax(statues);
        return max - min + 1 - statues.length;
    }

    int getMin(int[] statues) {
        int min = statues[0];
        for (int i = 1; i < statues.length; i++) {
            if (statues[i] < min)
                min = statues[i];
        }
        return min;
    }

    int getMax(int[] statues) {
        int max = statues[0];
        for (int i = 1; i < statues.length; i++) {
            if (statues[i] > max)
                max = statues[i];
        }
        return max;

    }

}
