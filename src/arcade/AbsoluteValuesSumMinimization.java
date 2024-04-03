package arcade;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.StrictMath.abs;

public class AbsoluteValuesSumMinimization {
    public static void main(String[] args) {
        //     int[] a = {2, 4, 7};
        //       int[] a = {2, 3};
        int[] a = {-4, -1};
        System.out.println(solution(a));
    }

    static int solution(int[] a) {
        // return a[(a.length-1)/2];
        Map<Integer, Integer> aMap = new TreeMap<>();
        int minValue = Integer.MAX_VALUE;
        int element = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += abs(a[j] - a[i]);
            }
            aMap.put(a[i], sum);
        }

        for (Map.Entry<Integer, Integer> entry : aMap.entrySet()) {
            if (entry.getValue() < minValue) {
                minValue = entry.getValue();
                element = entry.getKey();
            }
        }
        return element;
    }

}

/*
Given a sorted array of integers a, your task is to determine which element of a is closest to
all other values of a.
In other words, find the element x in a, which minimizes the following sum:

abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)
(where abs denotes the absolute value)

If there are several possible answers, output the smallest one.

Example

For a = [2, 4, 7], the output should be solution(a) = 4.

for x = 2, the value will be abs(2 - 2) + abs(4 - 2) + abs(7 - 2) = 7.
for x = 4, the value will be abs(2 - 4) + abs(4 - 4) + abs(7 - 4) = 5.
for x = 7, the value will be abs(2 - 7) + abs(4 - 7) + abs(7 - 7) = 8.
The lowest possible value is when x = 4, so the answer is 4.

For a = [2, 3], the output should be solution(a) = 2.

for x = 2, the value will be abs(2 - 2) + abs(3 - 2) = 1.
for x = 3, the value will be abs(2 - 3) + abs(3 - 3) = 1.
Because there is a tie, the smallest x between x = 2 and x = 3 is the answer.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.integer a

A non-empty array of integers, sorted in ascending order.

Guaranteed constraints:
1 ≤ a.length ≤ 1000,
-106 ≤ a[i] ≤ 106.
 */