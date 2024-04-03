package theCore;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveArrayPart {
    public static void main(String[] args) {
        int[] inputArray = {2, 3, 2, 3, 4, 5};
        int l = 2, r = 4;
        System.out.println(Arrays.toString(solution(inputArray, l, r)));

    }
    static int[] solution(int[] inputArray, int l, int r) {

        return IntStream.concat(IntStream.of(inputArray).limit(l), IntStream.of(inputArray).skip(r + 1)).toArray();
    }
}
/*
Remove a part of a given array between given 0-based indexes l and r (inclusive).

Example

For inputArray = [2, 3, 2, 3, 4, 5], l = 2, and r = 4, the output should be
solution(inputArray, l, r) = [2, 3, 5].

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.integer inputArray

Guaranteed constraints:
2 ≤ inputArray.length ≤ 104,
-105 ≤ inputArray[i] ≤ 105.

[input] integer l

Left index of the part to be removed (0-based).

Guaranteed constraints:
0 ≤ l ≤ r.

[input] integer r

Right index of the part to be removed (0-based).

Guaranteed constraints:
l ≤ r < inputArray.length.

[output] array.integer
 */
