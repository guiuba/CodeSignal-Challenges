package theCore;

import java.util.Arrays;

public class FirstReverseTry {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(arr)));
    }
    static int[] solution(int[] arr) {
        if (arr.length == 0) return arr;
        int aux = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = aux;
        return arr;

    }
}
/*
Reversing an array can be a tough task, especially for a novice programmer.
Mary just started coding, so she would like to start with something basic at first.
nstead of reversing the array entirely, she wants to swap just its first and last elements.

Given an array arr, swap its first and last elements and return the resulting array.

Example

For arr = [1, 2, 3, 4, 5], the output should be
solution(arr) = [5, 2, 3, 4, 1].

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.integer arr

Guaranteed constraints:
0 ≤ arr.length ≤ 50,
-104 ≤ arr[i] ≤ 104.

[output] array.integer

Array arr with its first and its last elements swapped.
 */
