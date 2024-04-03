package theCore;

public class IsSumOfConsecutive {
    public static void main(String[] args) {
        //   int n = 9; // 2 -> 2 + 3 + 4 = 9 and 4 + 5 = 9
        int n = 8; // 0

        System.out.println(solution(n));

    }

    static int solution(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            int iSum = 0;
            for (int j = i; j <= n; j++) {
                iSum += j;
                if (iSum == n) {
                    sum++;
                    iSum = 0;
                    break;
                }

            }
        }
        return sum;

    }
}

/*
Find the number of ways to express n as sum of some (at least two) consecutive positive integers.

Example

For n = 9, the output should be
solution(n) = 2.

There are two ways to represent n = 9: 2 + 3 + 4 = 9 and 4 + 5 = 9.

For n = 8, the output should be
solution(n) = 0.

There are no ways to represent n = 8.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

A positive integer.

Guaranteed constraints:
1 ≤ n ≤ 104.

[output] integer
 */
