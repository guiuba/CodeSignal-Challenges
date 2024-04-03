package theCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReplaceMiddle {
    public static void main(String[] args) {
        // int[] arr = {7, 2, 2, 5, 10, 7};
        int[] arr = {-5, -5, 10};
        System.out.println(Arrays.toString(solution(arr)));

    }

    static int[] solution(int[] arr) {
        int len = arr.length;
        if (len % 2 != 0) {
            return arr;
        }
        List<Integer> res = new ArrayList<>();
        int middleIndex = len / 2;
        int middle = arr[middleIndex - 1] + arr[middleIndex];
        return IntStream
                .concat(IntStream.concat(IntStream.of(arr).limit(middleIndex - 1), IntStream.of(middle)), IntStream.of(arr).skip(middleIndex + 1))
                .toArray();

    }
}

/*
We define the middle of the array arr as follows:

if arr contains an odd number of elements, its middle is the element whose index number is the same when
counting from the beginning of the array and from its end;
if arr contains an even number of elements, its middle is the sum of the two elements whose index numbers
when counting from the beginning and from the end of the array differ by one.
Given array arr, your task is to find its middle, and, if it consists of two elements, replace those elements
with the value of middle. Return the resulting array as the answer.

Example

For arr = [7, 2, 2, 5, 10, 7], the output should be
solution(arr) = [7, 2, 7, 10, 7].

The middle consists of two elements, 2 and 5. These two elements should be replaced with their sum, i.e. 7.

For arr = [-5, -5, 10], the output should be
solution(arr) = [-5, -5, 10].

The middle is defined as a single element -5, so the initial array with no changes should be returned.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.integer arr

The given array.

Guaranteed constraints:
2 ≤ arr.length ≤ 104,
-103 ≤ arr[i] ≤ 103.

[output] array.integer

arr with its middle replaced by a single element, or the initial array if the middle consisted of a single
element to begin with.
 */
