package leetcode.twopointers;

public class TwoSumInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0, j = numbers.length - 1; i < numbers.length / 2 && j >= numbers.length / 2; ) {
            if (numbers[i] + numbers[j] == target) {
                res[0] = i + 1;
                res[1] = j + 1;
                return res;
            } else if (numbers[i] + numbers[j] < target) {

                i++;


            } else if (numbers[i] + numbers[j] > target) {

                j--;


            }
        }

        return res;
    }
}
