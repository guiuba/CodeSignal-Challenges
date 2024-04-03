package arcade;

import java.util.Arrays;
import java.util.stream.Stream;

public class SpiralNumbers {
    public static void main(String[] args) {
        int n = 3;
        // System.out.println(solution(n));
        Stream.of(solution(n)).forEach(array -> System.out.println(Arrays.toString(array)));

    }

    static int[][] solution(int n) {
        int[][] spiral = new int[n][n];
        int walk = 1;
        int r0 = 0;  // up and down,  start boundary
        int c0 = 0;  //left and right,  start boundary
        int rL = n;  // up and down,  end boundary
        int cL = n;  //left and right,  end boundary

        while (r0 < rL && c0 < cL) {
            for (int x = c0; x < cL; x++) {
                spiral[r0][x] = walk;
                walk++;
            }
            r0++;
            for (int y = r0; y < rL; y++) {
                spiral[y][cL - 1] = walk;
                walk++;
            }

            cL--;
            for (int x = cL - 1; x >= c0; x--) {
                spiral[rL - 1][x] = walk;
                walk++;
            }
            rL--;
            for (int y = rL - 1; y >= r0; y--) {
                spiral[y][c0] = walk;
                walk++;
            }
            c0++;
        }
        return spiral;
    }
}
/*
Construct a square matrix with a size N × N containing
integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.

Example

For n = 3, the output should be

solution(n) = [[1, 2, 3],
               [8, 9, 4],
               [7, 6, 5]]
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

Matrix size, a positive integer.

Guaranteed constraints:
3 ≤ n ≤ 100.

[output] array.array.integer
 */