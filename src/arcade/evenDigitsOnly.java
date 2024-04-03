package arcade;

import java.util.Arrays;

public class evenDigitsOnly {
    public static void main(String[] args) {
        int n = 248622;
     //   int n = 642386;
        System.out.println(solution(n));
    }

    static boolean solution(int n) {
    //    return Arrays.stream(String.valueOf(n).split("")).noneMatch(elem -> Integer.parseInt(elem) % 2 != 0);
        return Arrays.stream(String.valueOf(n).split("")).allMatch(elem -> Integer.parseInt(elem) % 2 == 0);
   //     return Integer.toString(n).matches("(0|2|4|6|8)*");
    }
}

/*
Check if all digits of the given integer are even.

Example

For n = 248622, the output should be
solution(n) = true;
For n = 642386, the output should be
solution(n) = false.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

Guaranteed constraints:
1 ≤ n ≤ 109.

[output] boolean

true if all digits of n are even, false otherwise.
 */