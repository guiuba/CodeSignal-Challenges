package theCore;

import java.math.BigInteger;

public class CountBlackCells {
    public static void main(String[] args) {
        int n = 3, m = 4; // 6
  //      int n = 3, m = 3; // 7
        System.out.println(solution(n, m));

    }
    static int solution(int n, int m) {

       int gdc= BigInteger.valueOf(n).gcd(BigInteger.valueOf(m)).intValue();
        System.out.println(gdc);
       /* BigInteger numM = ;
        BigInteger result = new BigInteger().gcd()*/
        return n + m + gdc - 2;
    }
}

/*
Imagine a white rectangular grid of n rows and m columns divided into two parts by a diagonal
line running from the upper left to the lower right corner. Now let's paint the grid in two colors
according to the following rules:

A cell is painted black if it has at least one point in common with the diagonal;
Otherwise, a cell is painted white.
Count the number of cells painted black.

Example

For n = 3 and m = 4, the output should be
solution(n, m) = 6.

There are 6 cells that have at least one common point with the diagonal and therefore are painted black.



For n = 3 and m = 3, the output should be
solution(n, m) = 7.

7 cells have at least one common point with the diagonal and are painted black.



Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

The number of rows.

Guaranteed constraints:
1 ≤ n ≤ 105.

[input] integer m

The number of columns.

Guaranteed constraints:
1 ≤ m ≤ 105.

[output] integer

The number of black cells.
 */
