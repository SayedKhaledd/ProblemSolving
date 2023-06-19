package leetcode.arraysandhashing;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int[] arrLeft = new int[nums.length];
        int[] arrRight = new int[nums.length];
        arrLeft[0] = nums[0];
        arrRight[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1, j = nums.length - 2; i < nums.length; i++, j--) {
            arrLeft[i] = nums[i] * arrLeft[i - 1];
            arrRight[j] = nums[j] * arrRight[j + 1];
        }
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            output[i] = (i + 1 < nums.length ? arrRight[i + 1] : 1) * (i - 1 >= 0 ? arrLeft[i - 1] : 1);
        }
        return output;
    }

}
