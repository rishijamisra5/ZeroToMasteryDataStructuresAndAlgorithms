//Merge 2 sorted integer arrays
package Arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    //Time Complexity of this solution is O(a+b)
    //Space complexity of this solution is O(a+b)
    public static int[] mergeSortedArrays(int[] A, int[] B) {
        int[] result = new int[A.length + B.length];
        int index = 0;
        int i = 0;
        int j = 0;

        if (B.length == 0) {
            return A;
        } else if (A.length == 0) {
            return B;
        }

        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                result[index] = A[i];
                index++;
                i++;
                if (i == A.length) {
                    result[index] = B[j];
                    j++;
                }
            } else if (A[i] == B[j]) {
                result[index] = A[i];
                result[index + 1] = B[j];
                index = index + 2;
                i++;
                j++;
            } else {
                result[index] = B[j];
                index++;
                j++;
                if (j == B.length) {
                    result[index] = A[i];
                    i++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{0, 3, 4, 31}, new int[]{4, 6, 30})));
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{0, 3, 4, 31}, new int[]{4, 6})));
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{0, 3, 4, 31}, new int[]{})));
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{}, new int[]{4, 6, 30})));
    }
}
