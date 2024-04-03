package arcade;

public class ArrayMaximalAdjacentDifference {
    public static void main(String[] args) {
        int[] inputArray = {2, 4, 1, 0};
        System.out.println(solution(inputArray));
    }

   static int solution(int[] inputArray) {
        int max = 0;
        for (int i = 1; i < inputArray.length; i++) {
            int aux = Math.abs(inputArray[i] - inputArray[i - 1]);
            if (aux > max) {
                max = aux;
            }
            //  max = Math.max(max,Math.abs(inputArray[i] - inputArray[i-1]));
        }
        return max;
    }

}

/*
Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Example

For inputArray = [2, 4, 1, 0], the output should be
solution(inputArray) = 3.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.integer inputArray

Guaranteed constraints:
3 ≤ inputArray.length ≤ 10,
-15 ≤ inputArray[i] ≤ 15.

[output] integer

The maximal absolute difference.
 */