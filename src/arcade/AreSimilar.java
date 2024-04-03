package arcade;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AreSimilar {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {2, 1, 3};
        int[] d = {1, 2, 2};
        int[] e = {2, 1, 1};
        int[] f = {1, 2, 1, 2};
        int[] g = {2, 2, 1, 1};
        int[] h = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] i = {832, 570, 148, 998, 533, 561, 455, 147, 894, 279};
        System.out.println(solution(h, i));
    }

    static boolean solution(int[] a, int[] b) {
        Stack<Integer> mismatchIndex = new Stack<>();
        int counter = 0;
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                if (mismatchIndex.isEmpty()) {
                    mismatchIndex.add(i);
                    counter++;

                } else if (a[mismatchIndex.peek()] == b[i] && b[mismatchIndex.peek()] == a[i]) {
                    mismatchIndex.pop();
                }

                if (counter > 1) return false;
            }
        }
        return mismatchIndex.isEmpty();
    }
}

/*
boolean solution(int[] a, int[] b) {
    int rs = 0, s1 = 1, s2 = 1;
    for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i])
            rs++;
        s1 *= a[i];
        s2 *= b[i];
    }
    return rs <= 2 && s1 == s2;
}
 */

/*
Two arrays are called similar if one can be obtained from
another by swapping at most one pair of elements in one of the arrays.

Given two arrays a and b, check whether they are similar.

Example

For a = [1, 2, 3] and b = [1, 2, 3], the output should be
solution(a, b) = true.

The arrays are equal, no need to swap any elements.

For a = [1, 2, 3] and b = [2, 1, 3], the output should be
solution(a, b) = true.

We can obtain b from a by swapping 2 and 1 in b.

For a = [1, 2, 2] and b = [2, 1, 1], the output should be
solution(a, b) = false.

Any swap of any two elements either in a or in b won't make a and b equal.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.integer a

Array of integers.

Guaranteed constraints:
3 ≤ a.length ≤ 105,
1 ≤ a[i] ≤ 1000.

[input] array.integer b

Array of integers of the same length as a.

Guaranteed constraints:
b.length = a.length,
1 ≤ b[i] ≤ 1000.

[output] boolean

true if a and b are similar, false otherwise.
 */