//Create a function that reverses a string
package Strings;

public class ReverseAString {

    //Time Complexity of this solution is O(n)
    //Space complexity of this solution is O(n)
    public static String reversedString(String A) {
        StringBuilder result = new StringBuilder();
        if (A == null || A.length() == 1) {
            return A;
        }
        for (int i = A.length() - 1; i >= 0; i--) {
            result.append(A.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reversedString("!ihsiR si eman iH"));
        System.out.println(reversedString("H"));
        System.out.println(reversedString(""));
        System.out.println(reversedString(null));
    }
}
