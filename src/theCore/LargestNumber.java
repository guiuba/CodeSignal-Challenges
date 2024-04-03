package theCore;

public class LargestNumber {
    public static void main(String[] args) {
        int n = 2; // 99
      //  int n = 1; // 9
        System.out.println(solution(n));
    }
    static int solution(int n) {
        return Integer.parseInt(String.valueOf(9).repeat(n));
    }
}

/*
solução colega:  return (int)Math.pow(10,n) - 1;
Given an integer n, return the largest number that contains exactly n digits.

Example

For n = 2, the output should be
solution(n) = 99.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

Guaranteed constraints:
1 ≤ n ≤ 9.

[output] integer

The largest integer of length n.
 */