package arcade;

import java.util.Arrays;
import java.util.stream.Stream;

public class chessBoardCellColor {
    public static void main(String[] args) {
      /*  String cell1 = "A1";
        String cell2 = "C3";*/
        String cell1 = "A1";
        String cell2 = "H3";
        System.out.println(solution(cell1, cell2));
        //   Stream.of(chessBoard).map(Arrays::toString).forEach(System.out::println);
    }

    static boolean solution(String cell1, String cell2) {
        return  Math.abs(cell1.charAt(0) - cell2.charAt(0)) % 2 == //abs (65 - 72) % 2 = 1  // abs (65 - 67) % 2 = 0
                Math.abs(cell1.charAt(1) - cell2.charAt(1)) % 2;   //abs (49 - 51) % 2 = 0 //

   /*   int row1 = Integer.parseInt(Character.toString(cell1.charAt(0) - 17)); // falta transformar letra em numero
        int col1 = Integer.parseInt(String.valueOf(cell1.charAt(1))) - 1;
        int row2 = Integer.parseInt(Character.toString(cell2.charAt(0) - 17));
        int col2 = Integer.parseInt(String.valueOf(cell2.charAt(1))) - 1;
        boolean[][] chessBoard = new boolean[8][8];
        boolean trueSignal = true;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessBoard[i][j] = trueSignal;
                trueSignal = !trueSignal;
            }
            trueSignal = !trueSignal;
        }
        return chessBoard[row1][col1] == chessBoard[row2][col2];*/
    }
}

/*
Given two cells on the standard chess board, determine whether they have the same color or not.

Example

For cell1 = "A1" and cell2 = "C3", the output should be
solution(cell1, cell2) = true.

For cell1 = "A1" and cell2 = "H3", the output should be
solution(cell1, cell2) = false.
 */
