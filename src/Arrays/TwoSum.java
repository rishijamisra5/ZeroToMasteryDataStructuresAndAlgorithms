package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //Time Complexity of this solution is O(n)
    //Space Complexity of this solution is O(n^2) since we are using map and result.
    // For Map, space is n since max size is n for n elements. For result its 2
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int[] result = new int[2];
        //delta =0;
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //delta = target - nums[i];
            if (numMap.containsKey(target - nums[i])) {
                result[0] = numMap.get(target - nums[i]);
                result[1] = i;
            }
            numMap.put(nums[i], i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 7)));
        System.out.println(Arrays.toString(twoSum(null, 7)));
    }
}
