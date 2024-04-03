package theCore;

import java.util.stream.IntStream;

public class MakeArrayConsecutive2 {
    public static void main(String[] args) {

      //  int[] statues = {6, 2, 3, 8}; // 3
        int[] statues = {8}; // 3
        System.out.println(solution(statues));
    }
    static int solution(int[] statues) {
        int min = IntStream.of(statues).min().getAsInt();
        int max = IntStream.of(statues).max().getAsInt();
        int arrSize = statues.length;
        return (max - min + 1) - arrSize;
    }
}

/* colega:
    Arrays.sort(statues);
    return statues[statues.length-1] - statues[0] - statues.length + 1;
Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
each statue having an non-negative integer size. Since he likes to make things perfect,
he wants to arrange them from smallest to largest so that each statue will be bigger than
the previous one exactly by 1. He may need some additional statues to be able to accomplish
that. Help him figure out the minimum number of additional statues needed.

Example

For statues = [6, 2, 3, 8], the output should be
solution(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.integer statues

An array of distinct non-negative integers.

Guaranteed constraints:
1 ≤ statues.length ≤ 10,
0 ≤ statues[i] ≤ 20.

[output] integer

The minimal number of statues that need to be added to existing statues such that it
contains every integer size from an interval [L, R] (for some L, R) and no other sizes.
 */
