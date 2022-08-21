package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    //Time Complexity of this solution is O(n)
    //Space complexity of this solution is O(n)
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(nums[i])) {
                return true;
            }

            numMap.put(nums[i], true);
        }

        return false;

    }

    //Time Complexity of this solution is O(nlogn)
    //Space complexity of this solution is O(1)
    public static boolean containsDuplicateWithoutHashMap(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        System.out.println(containsDuplicateWithoutHashMap(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicateWithoutHashMap(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicateWithoutHashMap(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
