package org.example.codesignal.intro;

public class ShapeArea {
    int solution(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + i + (i - 1) * 2 + i - 2;
        }
        return arr[n];
    }

    int solution2(int n) {
        return (int) (Math.pow(n, 2) + Math.pow(n - 1, 2));
    }

}
