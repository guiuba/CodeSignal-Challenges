package arcade;

public class ChessKnight {
    public static void main(String[] args) {
    //    String cell = "a1"; //97 49
        String cell = "c2";
        System.out.println(solution(cell));
    }
    static int solution(String cell) {
        int counter = 0;
        int row = Integer.parseInt(String.valueOf(cell.charAt(0) - 96)); // transformar letra em numero
        int col = Integer.parseInt(String.valueOf(cell.charAt(1)));

        if (row + 2 <= 8 && col - 1 >= 1) counter++;
        if (row + 2 <= 8 && col + 1 <= 8) counter++;
        if (row + 1 <= 8 && col + 2 <= 8) counter++;
        if (row - 1 >= 1 && col + 2 <= 8) counter++;
        if (row - 2 >= 1 && col + 1 <= 8) counter++;
        if (row - 2 >= 1 && col - 1 >= 1) counter++;
        if (row - 1 >= 1 && col - 2 >= 1) counter++;
        if (row + 1 <= 8 && col - 2 >= 1) counter++;
        return counter;
    }
}

/*
solução colega:
  int moves = 8;
    if (cell.charAt(0) == 'b' || cell.charAt(0) == 'g') {
        moves -= 2;
    }
    if (cell.charAt(1) == '2' || cell.charAt(1) == '7') {
        moves -= 2;
    }
    if (cell.charAt(0) == 'a' || cell.charAt(0) == 'h') {
        moves /= 2;
    }
    if (cell.charAt(1) == '1' || cell.charAt(1) == '8') {
        moves /= 2;
    }
    return moves;
Given a position of a knight on the standard chessboard,
find the number of different moves the knight can perform.

The knight can move to a square that is two squares horizontally
and one square vertically, or two squares vertically and one square
horizontally away from it. The complete move therefore looks like the
letter L. Check out the image below to see all valid moves for a knight
piece that is placed on one of the central squares.

For cell = "a1", the output should be
solution(cell) = 2.

For cell = "c2", the output should be
solution(cell) = 6.

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string cell

String consisting of 2 letters - coordinates of the knight on an 8 × 8 chessboard in chess notation.

Guaranteed constraints:
cell.length = 2,
'a' ≤ cell[0] ≤ 'h',
1 ≤ cell[1] ≤ 8.


 */
