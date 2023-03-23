package classes;

/**
 * this is not my code
 * this code beat 100%
 * kinda somewhat similar to mine?
 *
 */
public class BestSolution {

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length())  return false;

        // If both strings equal, then check for duplicated char in string A.
        // Keep a count of each letrter 'a' to 'z', and if a count for a letter
        // is already non-zero, then a duplicate of that letter was found,
        // so same letters could be swapped between two strings that are equal
        // and the two strings will still be equal.  Use the String.equals
        // method because it is faster than a for-loop compare.
        if (A.equals(B)) {
            int[] charCount = new int['z' + 1];
            for (int i = A.length() - 1; i >= 0; i--)
                if (charCount[A.charAt(i)]++ > 0)  return true;
            return false;
        }

        // Find first different characters in the strings.  Start from end of
        // strings and scan back to beginning because this saves some tiny
        // amount of time over scanning forward.
        char[] ac = A.toCharArray();
        char[] bc = B.toCharArray();
        int first = ac.length - 1;
        while (first >= 0 && ac[first] == bc[first])  first--;

        // Find second different characters in the strings, if any.
        // If second diffenent characters found, then make sure they match for swapping.
        int second = first - 1;
        while (second >= 0 && ac[second] == bc[second])  second--;
        if (second < 0 || ac[first] != bc[second] || ac[second] != bc[first])  return false;

        // Make sure rest of string is the same.
        int rest = second - 1;
        while (rest >= 0 && ac[rest] == bc[rest])  rest--;
        return rest < 0;
    }
}
