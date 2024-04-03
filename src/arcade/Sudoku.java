package arcade;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sudoku {
    public static void main(String[] args) {
        int[][] grid0 = { // true
                {1, 3, 2, 5, 4, 6, 9, 8, 7},
                {4, 6, 5, 8, 7, 9, 3, 2, 1},
                {7, 9, 8, 2, 1, 3, 6, 5, 4},
                {9, 2, 1, 4, 3, 5, 8, 7, 6},
                {3, 5, 4, 7, 6, 8, 2, 1, 9},
                {6, 8, 7, 1, 9, 2, 5, 4, 3},
                {5, 7, 6, 9, 8, 1, 4, 3, 2},
                {2, 4, 3, 6, 5, 7, 1, 9, 8},
                {8, 1, 9, 3, 2, 4, 7, 6, 5}
        };


        int[][] grid = {  // false
                {8, 3, 6, 5, 3, 6, 7, 2, 9},
                {4, 2, 5, 8, 7, 9, 3, 8, 1},
                {7, 9, 1, 2, 1, 4, 6, 5, 4},
                {9, 2, 1, 4, 3, 5, 8, 7, 6},
                {3, 5, 4, 7, 6, 8, 2, 1, 9},
                {6, 8, 7, 1, 9, 2, 5, 4, 3},
                {5, 7, 6, 9, 8, 1, 4, 3, 2},
                {2, 4, 3, 6, 5, 7, 1, 9, 8},
                {8, 1, 9, 3, 2, 4, 7, 6, 5}
        };
        System.out.println(solution(grid));


    }

    static boolean solution(int[][] grid) {
        Set<Integer> allDigitsSet = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Set<Integer> rowDigitSet, colDigitSet, gridSubsetSet1, gridSubsetSet2, gridSubsetSet3;
        int[][] gridSubset1, gridSubset2, gridSubset3;

        // rows check
        for (int[] rows : grid) {
            rowDigitSet = new HashSet<>();
            for (int i : rows) {
                rowDigitSet.add(i);
            }
            if (!Objects.equals(allDigitsSet, rowDigitSet)) return false;
        }

        // cols check
        for (int i = 0; i < 9; i++) {
            colDigitSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                colDigitSet.add(grid[j][i]);
            }
            if (!Objects.equals(allDigitsSet, colDigitSet)) return false;
        }
        // sub-grids check

        for (int i = 0; i < 9; i += 3) {
            gridSubset1 = new int[3][3];
            gridSubset2 = new int[3][3];
            gridSubset3 = new int[3][3];
            gridSubsetSet1 = new HashSet<>();
            gridSubsetSet2 = new HashSet<>();
            gridSubsetSet3 = new HashSet<>();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    gridSubset1[j][k] = grid[j][i + k];
                    gridSubset2[j][k] = grid[j + 3][i + k];
                    gridSubset3[j][k] = grid[j + 6][i + k];
                }

            }
            for (int[] ints : gridSubset1) {
                for (int num : ints) {
                    gridSubsetSet1.add(num);
                }
            }
            if (!Objects.equals(gridSubsetSet1, allDigitsSet)) return false;

            for (int[] ints : gridSubset2) {
                for (int num : ints) {
                    gridSubsetSet2.add(num);
                }
            }
            if (!Objects.equals(gridSubsetSet2, allDigitsSet)) return false;

            for (int[] ints : gridSubset3) {
                for (int num : ints) {
                    gridSubsetSet3.add(num);
                }
            }
            if (!Objects.equals(gridSubsetSet3, allDigitsSet)) return false;

  /*          Arrays.stream(gridSubset1).forEach(array -> System.out.println(Arrays.toString(array)));
            System.out.println();
            Arrays.stream(gridSubset2).forEach(array -> System.out.println(Arrays.toString(array)));
            System.out.println();
            Arrays.stream(gridSubset3).forEach(array -> System.out.println(Arrays.toString(array)));
            System.out.println("---");*/
            //  if (!Objects.equals(allDigitsSet, colDigitSet)) return false;
        }

        return true;
    }
}

/*
solução colega:
 int[] rowsSumary = new int[9];
    int[] colsSumary = new int[9];
    int[] sectSumary = new int[9];
    for(int row = 0; row < 9; row++){
        for(int col = 0; col < 9; col++){
            rowsSumary[row] += grid[row][col];
            colsSumary[col] += grid[row][col];
            sectSumary[(col / 3) + ((row / 3) * 3)] += grid[row][col];
        }
    }
    return Arrays.stream(grid[0]).distinct().count() == 9 &&
           Arrays.stream(rowsSumary).allMatch(x -> x == 45) &&
           Arrays.stream(colsSumary).allMatch(x -> x == 45) &&
           Arrays.stream(sectSumary).allMatch(x -> x == 45);
           
arcade.Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid
with digits so that each column, each row, and each of the nine 3 × 3 sub-grids
that compose the grid contains all of the digits from 1 to 9.

This algorithm should check if the given grid of numbers represents a correct solution to arcade.Sudoku.

Example

For
grid = [[1, 3, 2, 5, 4, 6, 9, 8, 7],
        [4, 6, 5, 8, 7, 9, 3, 2, 1],
        [7, 9, 8, 2, 1, 3, 6, 5, 4],
        [9, 2, 1, 4, 3, 5, 8, 7, 6],
        [3, 5, 4, 7, 6, 8, 2, 1, 9],
        [6, 8, 7, 1, 9, 2, 5, 4, 3],
        [5, 7, 6, 9, 8, 1, 4, 3, 2],
        [2, 4, 3, 6, 5, 7, 1, 9, 8],
        [8, 1, 9, 3, 2, 4, 7, 6, 5]]
the output should be
solution(grid) = true;

For
grid = [[8, 3, 6, 5, 3, 6, 7, 2, 9],
        [4, 2, 5, 8, 7, 9, 3, 8, 1],
        [7, 9, 1, 2, 1, 4, 6, 5, 4],
        [9, 2, 1, 4, 3, 5, 8, 7, 6],
        [3, 5, 4, 7, 6, 8, 2, 1, 9],
        [6, 8, 7, 1, 9, 2, 5, 4, 3],
        [5, 7, 6, 9, 8, 1, 4, 3, 2],
        [2, 4, 3, 6, 5, 7, 1, 9, 8],
        [8, 1, 9, 3, 2, 4, 7, 6, 5]]
the output should be
solution(grid) = false.

The output should be false: each of the nine 3 × 3 sub-grids should contain all of the digits from 1 to 9.
These examples are represented on the image below.



Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.array.integer grid

A matrix representing 9 × 9 grid already filled with numbers from 1 to 9.

Guaranteed constraints:
grid.length = 9,
grid[i].length = 9,
1 ≤ grid[i][j] ≤ 9.

[output] boolean

true if the given grid represents a correct solution to arcade.Sudoku, false otherwise.
 */
