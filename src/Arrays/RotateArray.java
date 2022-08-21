package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {

        //Time Complexity of this solution is O(n)
        //Space complexity of this solution is O(1)
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        
        return nums;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{1,2,3,4,5,6,7}, 3)));
        System.out.println(Arrays.toString(rotate(new int[]{-1}, 2)));
    }
}
