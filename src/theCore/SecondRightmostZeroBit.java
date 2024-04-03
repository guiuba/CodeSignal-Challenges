package theCore;

public class SecondRightmostZeroBit {
    public static void main(String[] args) {
        int n = 37; // 8
        System.out.println(solution(n));

    }

    static int solution(int n) {
        String num = Integer.toBinaryString(n);
        int zeroCounter = 0;
        int res = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) == '0') {
                zeroCounter++;
            }
            if (zeroCounter == 2) {
                res = Integer.parseInt("1".concat("0".repeat(num.length() - i - 1)), 2);
                break;
            }
        }
        return res;
        //  return ~(n|(n+1)) & ((n|(n+1))+1) ;
    }
}

/*
Implement the missing code, denoted by ellipses. You may not modify the pre-existing code.
Presented with the integer n, find the 0-based position of the second rightmost zero bit in
 its binary representation (it is guaranteed that such a bit exists), counting from right to left.

Return the value of 2position_of_the_found_bit.

Example

For n = 37, the output should be
solution(n) = 8.

3710 = 1001012. The second rightmost zero bit is at position 3 (0-based) from the right in the
binary representation of n.
Thus, the answer is 23 = 8.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

Guaranteed constraints:
4 ≤ n ≤ 230.

[output] integer
 */
