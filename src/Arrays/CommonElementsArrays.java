//Given two arrays and our task is to find their common elements.
//Time Complexity of this solution: O(a+b)
//Space Complexity of this solution: O(a) since we created a new map of length a
package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CommonElementsArrays {
    public static boolean foundCommonItem(char[] A, char[] B) {
        boolean result = false;
        Map<Character, Boolean> Amap = new HashMap<>();
        if (A== null || B==null || A.length==0 || B.length == 0){
            return result;
        }
        for (int i = 0; i < A.length; i++) {
            Amap.putIfAbsent(A[i], true);
        }
        for (int j = 0; j < B.length; j++) {
            if (Amap.get(B[j]) != null) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(foundCommonItem(new char[]{'a', 'b', 'c', 'x'}, new char[]{'z', 'y', 'x'}));
        System.out.println(foundCommonItem(null, new char[]{'z', 'y', 'x'}));
        System.out.println(foundCommonItem(new char[]{}, new char[]{'z', 'y', 'x'}));
    }
}
