package arcade;

public class ArrayMaxConsecutiveSum {
    public static void main(String[] args) {
    int[] inputArray = {2, 3, 5, 1, 6};
        System.out.println(solution(inputArray, 2));
    }

    static int solution(int[] inputArray, int k) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if(i + k - 1 < inputArray.length) {
                for(int j = i; j <= i + k - 1; j++) {
                    sum += inputArray[j];
                }
                max = Math.max(sum, max);
                sum = 0;
            }
        }
        return max;
    }
}

/*
Given array of integers, find the maximal possible sum of some of its k consecutive elements.

Example

For inputArray = [2, 3, 5, 1, 6] and k = 2, the output should be
solution(inputArray, k) = 8.
All possible sums of 2 consecutive elements are:

2 + 3 = 5;
3 + 5 = 8;
5 + 1 = 6;
1 + 6 = 7.
Thus, the answer is 8.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.integer inputArray

Array of positive integers.

Guaranteed constraints:
3 ≤ inputArray.length ≤ 105,
1 ≤ inputArray[i] ≤ 1000.

[input] integer k

An integer (not greater than the length of inputArray).

Guaranteed constraints:
1 ≤ k ≤ inputArray.length.

[output] integer

The maximal possible sum.
 */
