package theCore;

import java.util.Arrays;

public class CreateArray{
    public static void main(String[] args) {
        int size = 4;
        System.out.println(Arrays.toString(solution(size)));

    }
    static int[] solution(int size) {

        int[] res = new int[size];
        Arrays.fill(res,1);
        return res;
        // colega  return IntStream.range(0,size).map(i->1).toArray();}
    }

}

/*
Given an integer size, return array of length size filled with 1s.

Example

For size = 4, the output should be
solution(size) = [1, 1, 1, 1].

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer size

A positive integer.

Guaranteed constraints:
1 ≤ size ≤ 1000.

[output] array.integer
 */
