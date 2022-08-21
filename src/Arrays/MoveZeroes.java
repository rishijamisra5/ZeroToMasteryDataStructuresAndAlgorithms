package Arrays;

import java.util.Arrays;

public class MoveZeroes {
//0 1 0 3 12
//If during traversal, the number is zero, do nothing
// We find first non-zero number
//We then swap the non-zero number with 1st zero number then increment the leftPointer
//We repeat this until all non-zero numbers are swapped to the left with all zeros  swapped towards the right
//1 3 12 0 0
//Time Complexity of this solution is O(n) for the for loop
//Space COmplexity for this solution is O(1) since no new object is used to store the array elements
    public static int[] moveZeroes(int[] nums) {
        int leftPointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                int temp = nums[leftPointer];
                nums[leftPointer] = nums[i];
                nums[i] = temp;
                leftPointer++;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0, 1, 0, 3, 12})));
        System.out.println(Arrays.toString(moveZeroes(new int[]{1})));
        System.out.println(Arrays.toString(moveZeroes(new int[]{0})));
        System.out.println(Arrays.toString(moveZeroes(new int[]{2, 1})));
        System.out.println(Arrays.toString(moveZeroes(new int[]{0, 0, 1})));
    }

}
