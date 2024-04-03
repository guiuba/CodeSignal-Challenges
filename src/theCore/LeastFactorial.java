package theCore;

public class LeastFactorial {
    public static void main(String[] args) {

     //   int n = 17;
        int n = 24;
        System.out.println(solution(n));
    }
    static int solution(int n) {
        int result = 1;
        for (int i = result; i <= n; i++) {
            if (result >= n) {
                break;
            }
            result *= i;
        }
        return result;
    }

}
/*
solução colega:
    int k = 1, c = 1;
    while (k < n) k *= c++;
    return k;

    Given an integer n, find the minimal k such that

k = m! (where m! = 1 * 2 * ... * m) for some integer m;
k >= n.
In other words, find the smallest factorial which is not less than n.

Example

For n = 17, the output should be
solution(n) = 24.

17 < 24 = 4! = 1 * 2 * 3 * 4, while 3! = 1 * 2 * 3 = 6 < 17).

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

A positive integer.

Guaranteed constraints:
1 ≤ n ≤ 120.

[output] integer

[Java] Syntax Tips
 */