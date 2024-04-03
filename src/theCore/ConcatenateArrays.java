package theCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConcatenateArrays {
    public static void main(String[] args) {
        int[] a = {2, 2, 1};
        int[] b = {10, 11};
        System.out.println(Arrays.toString(solution(a, b)));

    }
    static int[] solution(int[] a, int[] b) {
   /* static Integer[] solution(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, Arrays.stream(a).boxed().toArray(Integer[]::new));
        Collections.addAll(list, Arrays.stream(b).boxed().toArray(Integer[]::new));
        Integer[] res = new Integer[a.length + b.length];

        res = list.toArray(res);
        return res;*/
       return IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
    }
}

/*
Given two arrays of integers a and b, obtain the array formed by the elements
of a followed by the elements of b.

Example

For a = [2, 2, 1] and b = [10, 11], the output should be
solution(a, b) = [2, 2, 1, 10, 11].

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 10,
1 ≤ a[i] ≤ 15.

[input] array.integer b

Guaranteed constraints:
0 ≤ b.length ≤ 10,
1 ≤ b[i] ≤ 15.

[output] array.integer
 */
