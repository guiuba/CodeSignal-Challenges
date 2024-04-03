package arcade;

public class BishopAndPawn {
    public static void main(String[] args) {
        String bishop = "a1", pawn = "c3"; // true
     //   String bishop = "h1", pawn = "h3"; // false
      //  String bishop = "g1", pawn = "f3"; // false
       // System.out.println('a' - 96);
        System.out.println(solution(bishop, pawn));
    }
    static boolean solution(String bishop, String pawn) {
        int bishopX = bishop.charAt(0);
        int bishopY = bishop.charAt(1);
        int pawnX = pawn.charAt(0);
        int pawnY = pawn.charAt(1);

        return bishopX != pawnX && bishopY != pawnY && Math.abs(bishopY - pawnY) == Math.abs(bishopX - pawnX);
        //    return(Math.abs(bishop.charAt(0) - pawn.charAt(0))) == (Math.abs(bishop.charAt(1) - pawn.charAt(1))); solução colega
    }
}

/*
Given the positions of a white bishop and a black pawn on the
standard chess board, determine whether the bishop can capture
the pawn in one move.

The bishop has no restrictions in distance for each move, but
is limited to diagonal movement. Check out the example below to
see how it can move:
 */