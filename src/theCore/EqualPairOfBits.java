package theCore;

public class EqualPairOfBits {
    public static void main(String[] args) {
  //    int n = 1073741824, m = 1006895103;
        int n = 10, m = 11;
     //   int n = 11, m = 13;
    //    System.out.println(n ^ m);
   //     System.out.println(Integer.toBinaryString(n));
   //     System.out.println(Integer.toBinaryString(m));
        System.out.println(solution(n, m));

    }
    static int solution(int n, int m) {

        return Integer.lowestOneBit(~(m ^ n));
    }
}

/*
Implement the missing code, denoted by ellipses. You may not modify the pre-existing code.
You're given two integers, n and m. Find position of the rightmost pair of equal bits in
their binary representations (it is guaranteed that such a pair exists), counting from right to left.

Return the value of 2position_of_the_found_pair (0-based).

Example

For n = 10 and m = 11, the output should be
solution(n, m) = 2.

1010 = 10102, 1110 = 10112, the position of the rightmost pair of equal bits is the bit at position
1 (0-based) from the right in the binary representations.
So the answer is 21 = 2.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

Guaranteed constraints:
0 ≤ n ≤ 230.

[input] integer m

Guaranteed constraints:
0 ≤ m ≤ 230.

[output] integer
 */
