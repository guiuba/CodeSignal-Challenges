package arcade;

public class DeleteDigit {
    public static void main(String[] args) {
       // int n = 152;
        int n = 1001;
        System.out.println(solution(n));

    }
    static int solution(int n) {
        int max = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            String subS = s.substring(0, i) + s.substring(i + 1);
            int newNum = Integer.parseInt(subS);
            if (newNum > max) max = newNum;
        }
        return max;
    }
}

/*
colega:
    int max = 0;
    for (int t = 1; t < n; t *= 10)
        max = Math.max(n / 10 / t * t + n % t, max);
    return max;
Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.

Example

For n = 152, the output should be
solution(n) = 52;
For n = 1001, the output should be
solution(n) = 101.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

Guaranteed constraints:
10 ≤ n ≤ 106.

[output] integer
 */