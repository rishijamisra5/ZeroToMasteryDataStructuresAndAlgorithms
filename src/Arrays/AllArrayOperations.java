package Arrays;

import java.util.Arrays;

public class AllArrayOperations {
    //Add character b in last index of an array A
    public static char[] addElement(char[] A, char b) {
        if (A != null) {
            char[] result = new char[A.length + 1];
            for (int i = 0; i < A.length; i++) {
                result[i] = A[i];
            }
            result[result.length - 1] = b;
            return result;
        }

        return null;
    }

    //Add character b in kth index of an array A
    public static char[] addElementInIndex(char[] A, char b, int k) {
        if (A != null) {
            char[] result = new char[A.length + 1];
            if (k <= A.length) {
                for (int i = 0; i < k; i++) {
                    result[i] = A[i];
                }
                result[k] = b;
                for (int j = k + 1; j < result.length; j++) {
                    result[j] = A[j - 2];
                }
                return result;
            } else {
                return A;
            }
        }

        return null;
    }

    //Remove character from kth index of an array A
    public static char[] removeElementInIndex(char[] A, int k) {
        if (A != null) {
            char[] result = new char[A.length - 1];
            if (k < A.length) {
                for (int i = 0; i < k; i++) {
                    result[i] = A[i];
                }
                for (int j = k; j < result.length; j++) {
                    result[j] = A[j + 1];
                }
                return result;
            } else {
                return A;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(addElement(new char[]{'a', 'b', 'c', 'd'}, 'z')));
        System.out.println(Arrays.toString(addElementInIndex(new char[]{'a', 'b', 'c', 'd'}, 'z', 3)));
        System.out.println(Arrays.toString(addElementInIndex(new char[]{'a', 'b', 'c', 'd'}, 'z', 4)));
        System.out.println(Arrays.toString(addElementInIndex(new char[]{'a', 'b', 'c', 'd'}, 'z', 5)));
        System.out.println(Arrays.toString(removeElementInIndex(new char[]{'a', 'b', 'c', 'd'}, 2)));
        System.out.println(Arrays.toString(removeElementInIndex(new char[]{'a', 'b', 'c', 'd'}, 3)));
        System.out.println(Arrays.toString(removeElementInIndex(new char[]{'a', 'b', 'c', 'd'}, 4)));
    }
}
