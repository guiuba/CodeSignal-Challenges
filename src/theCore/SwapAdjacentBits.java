package theCore;

public class SwapAdjacentBits {
    public static void main(String[] args) {
        int n = 13; // 14
        //   int n = 74; // 133
     //   int n = 1073741823;
        System.out.println(solution(n));

    }

    static int solution(int n) {
        return ((n & 0b01010101010101010101010101010101) << 1|
                ((n & 0b10101010101010101010101010101010) >> 1));

    }
}

/*

     a1a2        a1a2
 &   0 1    &    1 0
 <<  0 a2    >>  a1 0
     a2 0   |     0  a1
           a2a1 (swapped)

 e.g  a1a2(01)
     0 1         0 1
 &   0 1    &    1 0
 <<  0 1    >>   0 0
     1 0   |     0 0
          10 (swapped)


Implement the missing code, denoted by ellipses. You may not modify the pre-existing code.
You're given an arbitrary 32-bit integer n. Take its binary representation, split bits into it in
pairs (bit number 0 and 1, bit number 2 and 3, etc.) and swap bits in each pair. Then return the
result as a decimal number.

Example

For n = 13, the output should be
solution(n) = 14.

1310 = 11012 ~> {11}{01}2 ~> 11102 = 1410.

For n = 74, the output should be
solution(n) = 133.

7410 = 010010102 ~> {01}{00}{10}{10}2 ~> 100001012 = 13310.
Note the preceding zero written in front of the initial number: since both numbers are
32-bit integers, they have 32 bits in their binary representation. The preceding zeros in other
cases don't matter, so they are omitted. Here, however, it does make a difference.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

Guaranteed constraints:
0 ≤ n < 230.

[output] integer

[Java] Syntax Tips
 */
