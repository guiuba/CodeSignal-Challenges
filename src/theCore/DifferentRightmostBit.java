package theCore;

public class DifferentRightmostBit {
    public static void main(String[] args) {
      //  int n = 42, m = 22;
        int n = 11, m = 13; //2
    //    int m = 52, n = 4;
        System.out.println(solution(n, m));


    }
    static int solution(int n, int m) {
        return Integer.lowestOneBit(n ^ m);

/*        int mask = 1;
        int counter = 0;
        while ((mask & n) == (mask & m)) {
            mask <<= 1;
            counter++;
        }
        return (int) Math.pow(2, counter);*/
    }





}

/*
Implement the missing code, denoted by ellipses. You may not modify the pre-existing code.
You're given two integers, n and m. Find position of the rightmost bit in which they differ
in their binary representations (it is guaranteed that such a bit exists), counting from right to left.

Return the value of 2position_of_the_found_bit (0-based).

Example

For n = 11 and m = 13, the output should be
solution(n, m) = 2.

11(10) = 1011(2), 13(10) = 1101(2), the rightmost bit in which they differ is the bit at position 1 (0-based)
from the right in the binary representations.
So the answer is 21 = 2.

For n = 7 and m = 23, the output should be
solution(n, m) = 16.

710 = 1112, 2310 = 101112, i.e.

00111
10111
So the answer is 24 = 16.
 */
