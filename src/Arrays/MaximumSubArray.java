package Arrays;

public class MaximumSubArray {
    //This solution is sliding window method. If sum is anytime negative, we set it to 0 and move on to the next index in array.
    //Time Complexity of this solution is O(n)
    //Space Complexity of this solution is O(n)
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int result = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum = sum + nums[i];
            result = Math.max(result, sum);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray(new int[]{1}));
        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}
