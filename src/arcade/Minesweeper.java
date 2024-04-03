package arcade;

import java.util.Arrays;

public class Minesweeper {
    public static void main(String[] args) {
        boolean[][] matrix = {
                {true, false, false},
                {false, true, false},
                {false, false, false}};

        //  System.out.println(Arrays.toString(solution(matrix)));
        Arrays.stream(solution(matrix)).map(Arrays::toString).forEach(System.out::println);
    }

    static int[][] solution(boolean[][] matrix) {
        int[][] solution = new int[matrix.length][matrix[0].length];
        for (int[] s : solution) {
            Arrays.fill(s, 1);
        }


        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (i - 1 >= 0 && j - 1 >= 0) {
                    if (matrix[i - 1][j - 1]) {
                        counter++;
                    }
                }
                if (i - 1 >= 0) {
                    if (matrix[i - 1][j]) {
                        counter++;
                    }
                }
                if (i - 1 >= 0 && j + 1 < matrix[i].length) {
                    if (matrix[i - 1][j + 1]) {
                        counter++;
                    }
                }
                if (j - 1 >= 0) {
                    if (matrix[i][j - 1]) {
                        counter++;
                    }
                }
                if (j + 1 < matrix[i].length) {
                    if (matrix[i][j + 1]) {
                        counter++;
                    }
                }
                if (i + 1 < matrix.length && j - 1 >= 0) {
                    if (matrix[i + 1][j - 1]) {
                        counter++;
                    }
                }
                if (i + 1 < matrix.length) {
                    if (matrix[i + 1][j]) {
                        counter++;
                    }
                }
                if (i + 1 < matrix.length && j + 1 < matrix[i].length) {
                    if (matrix[i + 1][j + 1]) {
                        counter++;
                    }
                }
                solution[i][j] = counter;
                counter = 0;

            }
        }
        return solution;
    }
}

/*
In the popular arcade.Minesweeper game you have a board with some mines and those cells
that don't contain a mine have a number in it that indicates the total number of
mines in the neighboring cells. Starting off with some arrangement of mines we
want to create a arcade.Minesweeper game setup.
Example

For

matrix = [[true, false, false],
          [false, true, false],
          [false, false, false]]
the output should be

solution(matrix) = [[1, 2, 1],
                    [2, 1, 1],
                    [1, 1, 1]]
 */
