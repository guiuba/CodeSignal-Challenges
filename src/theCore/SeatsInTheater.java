package theCore;

public class SeatsInTheater {
    public static void main(String[] args) {
     //   int nCols = 16, nRows = 11, col = 5, row = 3; // 96
   //     int nCols = 1, nRows = 1, col = 1, row = 1; // 0
        int nCols = 13, nRows = 6, col = 8, row = 3; // 18

        System.out.println(solution(nCols, nRows, col, row));
    }
    static int solution(int nCols, int nRows, int col, int row) {
        int rowsBehind = nRows - row, colsToCross = nCols - col + 1;
        return rowsBehind * colsToCross;
    }
}

/*
Your friend advised you to see a new performance in the most popular theater
in the city. He knows a lot about art and his advice is usually good, but not
this time: the performance turned out to be awfully dull. It's so bad you want
to sneak out, which is quite simple, especially since the exit is located right
behind your row to the left. All you need to do is climb over your seat and make
your way to the exit.

The main problem is your shyness: you're afraid that you'll end up blocking the
view (even if only for a couple of seconds) of all the people who sit behind you
and in your column or the columns to your left. To gain some courage, you decide
to calculate the number of such people and see if you can possibly make it to the
exit without disturbing too many people.

Given the total number of rows and columns in the theater (nRows and nCols,
respectively), and the row and column you're sitting in, return the number of
people who sit strictly behind you and in your column or to the left, assuming
all seats are occupied.

Example

For nCols = 16, nRows = 11, col = 5, and row = 3, the output should be
solution(nCols, nRows, col, row) = 96
 */