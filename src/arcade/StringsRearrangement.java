package arcade;

import java.util.*;

public class StringsRearrangement {
    public static void main(String[] args) {
     //   String[] inputArray = {"aba", "bbb", "bab"};
        //   String[] inputArray = {"ab", "bb", "aa"};
        String[] inputArray = {"aa", "aa", "aa"};
        System.out.println(solution(inputArray));
    }

    static boolean solution(String[] inputArray) {
        LinkedList<String> tries = new LinkedList<>(Arrays.stream(inputArray).toList());
        LinkedList<String> matches = new LinkedList<>();
        matches.offer(tries.poll());
        int len = matches.getFirst().length();
        while (!tries.isEmpty()) {
            int numOfTries = tries.size();
            String first = matches.getFirst();
            String last = matches.getLast();

            for (int t = 0; t < numOfTries; t++) {
                String actual = tries.poll();
                if (exactOneDiff(first, actual, len)) {
                    matches.offerFirst(actual);
                    break;
                } else if (exactOneDiff(last, actual, len)) {
                    matches.offerLast(actual); ;
                    break;
                } else {
                    tries.offer(actual);
                }
            }
            if (numOfTries == tries.size()) return false;
        }
        return true;
    }

    static boolean exactOneDiff(String target, String actual, int len) {
        int diff = 0;
        for (int ch = 0; ch < len; ch++) {
            if (target.charAt(ch) != actual.charAt(ch)) {
                diff++;
            }
        }
        return diff == 1;
    }
}

/*
Given an array of equal-length strings, you'd like to know if it's possible to rearrange the order of
the elements in such a way that each consecutive pair of strings differ by exactly one character.
Return true if it's possible, and false if not.

Note: You're only rearranging the order of the strings, not the order of the letters within the strings!

Example

For inputArray = ["aba", "bbb", "bab"], the output should be
solution(inputArray) = false.

There are 6 possible arrangements for these strings:

["aba", "bbb", "bab"]
["aba", "bab", "bbb"]
["bbb", "aba", "bab"]
["bbb", "bab", "aba"]
["bab", "bbb", "aba"]
["bab", "aba", "bbb"]
None of these satisfy the condition of consecutive strings differing by 1 character, so the answer is false.

For inputArray = ["ab", "bb", "aa"], the output should be
solution(inputArray) = true.

It's possible to arrange these strings in a way that each consecutive pair of strings differ by 1 character
(eg: "aa", "ab", "bb" or "bb", "ab", "aa"), so return true.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.string inputArray

A non-empty array of strings of lowercase letters.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 15.

[output] boolean

Return true if the strings can be reordered in such a way that each neighbouring pair of strings
differ by exactly one character (false otherwise).
 */