package arcade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExtractEachKth {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(solution(inputArray, 3)));
    }

    static int[] solution(int[] inputArray, int k) {
        // return IntStream.range(0, inputArray.length).filter(i -> ((i + 1) % k) != 0).map(i -> inputArray[i]).toArray()
        int size = inputArray.length;
        int[] outputArray = new int[size - size / k];
        int pointer = 0;
        for (int i = 0; i < size; i++) {
            if ((i + 1) % k != 0) {
                outputArray[pointer] = inputArray[i];
                pointer++;
            }
        }
        return outputArray;
    }
}

/*
Given array of integers, remove each kth element from it.

Example

For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
solution(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.integer inputArray

Guaranteed constraints:
5 ≤ inputArray.length ≤ 15,
-20 ≤ inputArray[i] ≤ 20.

[input] integer k

Guaranteed constraints:
1 ≤ k ≤ 10.

[output] array.integer

inputArray without elements k - 1, 2k - 1, 3k - 1 etc.
 */
