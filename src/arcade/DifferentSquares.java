package arcade;

import ibmHackerrankSampleTests.ArraySubsets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class DifferentSquares {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 1},
                {2, 2, 2},
                {2, 2, 2},
                {1, 2, 3},
                {2, 2, 1}};
        System.out.println(solution(matrix));

    }

    static int solution(int[][] matrix) {
        Set<String> differentSquaresSet = new HashSet<>();
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int k = 0; k < matrix[i].length - 1; k++) {
                differentSquaresSet.add(
                        matrix[i][k] + "" +
                                matrix[i][k + 1] + "" +
                                matrix[i + 1][k] + "" +
                                matrix[i + 1][k + 1]);
            }
        }
        return differentSquaresSet.size();
    }
}

/*
Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.

Example

For

matrix = [[1, 2, 1],
          [2, 2, 2],
          [2, 2, 2],
          [1, 2, 3],
          [2, 2, 1]]
the output should be
solution(matrix) = 6.

Here are all 6 different 2 × 2 squares:

1 2
2 2
2 1
2 2
2 2
2 2
2 2
1 2
2 2
2 3
2 3
2 1
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.array.integer matrix

Guaranteed constraints:
1 ≤ matrix.length ≤ 100,
1 ≤ matrix[i].length ≤ 100,
0 ≤ matrix[i][j] ≤ 9.

[output] integer

The number of different 2 × 2 squares in matrix.
 */