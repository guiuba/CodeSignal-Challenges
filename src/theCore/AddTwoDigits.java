package theCore;

public class AddTwoDigits {
    public static void main(String[] args) {
      //  int n = 29; // 11
      //  int n = 48; // 12
        int n = 10; // 1

        System.out.println(solution(n));
    }
    static int solution(int n) {
        return n / 10 + n % 10;
    }
}

/*
You are given a two-digit integer n. Return the sum of its digits.

Example

For n = 29, the output should be
solution(n) = 11.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

A positive two-digit integer.

Guaranteed constraints:
10 ≤ n ≤ 99.

[output] integer

The sum of the first and second digits of the input number.
 */
