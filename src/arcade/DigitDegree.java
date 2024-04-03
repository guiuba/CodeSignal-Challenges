package arcade;

import java.util.Arrays;

public class DigitDegree {
    public static void main(String[] args) {
        //  int n = 5;
        //   int n = 100;
        int n = 91;
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int counter = 0;
        int sum = 0;
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        if (sb.toString().length() == 1) return counter;

        while (sb.toString().length() > 1) {
            for (int i = 0; i < sb.length(); i++) { 
                sum += Integer.parseInt(String.valueOf(sb.charAt(i)));
            }
            sb.replace(0, sb.length(), String.valueOf(sum));
            counter++;
            sum = 0;
        }

        return counter;
    }

}

/*
Let's define digit degree of some positive integer as the number of times
we need to replace this number with the sum of its digits until we get to a one digit number.

Given an integer, find its digit degree.

Example

For n = 5, the output should be
solution(n) = 0;
For n = 100, the output should be
solution(n) = 1.
1 + 0 + 0 = 1.
For n = 91, the output should be
solution(n) = 2.
9 + 1 = 10 -> 1 + 0 = 1.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

Guaranteed constraints:
5 ≤ n ≤ 109.

[output] integer
 */