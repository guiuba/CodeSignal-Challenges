package theCore;

import java.util.Arrays;
import java.util.StringTokenizer;

public class AdditionWithoutCarrying {
    public static void main(String[] args) {
        int param1 = 456, param2 = 1734;
        System.out.println(solution(param1, param2));

    }

    static int solution(int param1, int param2) {
        StringBuilder s1 = new StringBuilder(String.valueOf(param1));
        StringBuilder s2 = new StringBuilder(String.valueOf(param2));
        StringBuilder res = new StringBuilder();
        boolean s1IsBigger = s1.length() > s2.length();
        int diff = Math.abs(s1.length() - s2.length());
        if (diff > 0) {
            if (s1IsBigger) {
                s2.insert(0, "0".repeat(diff));
            } else {
                s1.insert(0, "0".repeat(diff));
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            String sum = String.valueOf(Integer.parseInt(String.valueOf(s1.charAt(i))) + Integer.parseInt(String.valueOf(s2.charAt(i))));
            String sumLastDigit = sum.substring(sum.length() - 1);
            res.append(sumLastDigit);
        }
        return Integer.parseInt(res.toString());
    }
}

/* solução colega:
 if (param1 == 0 || param2 == 0) {return param1+param2;}
    return solution(param1/10,param2/10)*10 + (param1+param2)%10;

A little child is studying arithmetic. They have just learned how to add two integers,
written one below another, column by column. But the child always forgets about the
important part - carrying.

Given two integers, your task is to find the result that the child will get.

Note: The child had learned from this site, so feel free to check it out too if you
are not familiar with column addition.

Example

For param1 = 456 and param2 = 1734, the output should be
solution(param1, param2) = 1180.

   456
  1734
+ ____
  1180
The child performs the following operations from right to left:

6 + 4 = 10 but the child forgets about carrying the 1 and just writes down the 0 in the last column
5 + 3 = 8
4 + 7 = 11 but the child forgets about the leading 1 and just writes down 1 under 4 and 7.
There is no digit in the first number corresponding to the leading digit of the second one,
so the child imagines that 0 is written before 456. Thus, they get 0 + 1 = 1.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer param1

A non-negative integer.

Guaranteed constraints:
0 ≤ param1 < 105.

[input] integer param2

A non-negative integer.

Guaranteed constraints:
0 ≤ param2 < 6 · 104.

[output] integer

The result that the little child will get by using column addition without carrying.
 */
