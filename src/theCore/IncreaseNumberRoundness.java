package theCore;

public class IncreaseNumberRoundness {
    public static void main(String[] args) {

     //   int n = 902200100;
        int n = 11000;
        System.out.println(solution(n));
    }
    static boolean solution(int n) {
        // colega return (n+"").matches(".*0[^0]+0*");
        String num = String.valueOf(n);
        for (int i = num.length() - 1; i >= 0; i--) {
            if(num.charAt(i) == '0') {
                continue;
            } else if(i - 1 >= 0 && num.charAt(i - 1) == '0') {
                return true;
            }
        }

        return false;
    }
}

/*
Define an integer's roundness as the number of trailing zeroes in it.

Given an integer n, check if it's possible to increase n's roundness by swapping some pair of its digits.

Example

For n = 902200100, the output should be
solution(n) = true.

One of the possible ways to increase roundness of n is to swap digit 1 with digit 0 preceding it: roundness
of 902201000 is 3, and roundness of n is 2.

For instance, one may swap the leftmost 0 with 1.

For n = 11000, the output should be
solution(n) = false.

Roundness of n is 3, and there is no way to increase it.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

A positive integer.

Guaranteed constraints:
100 ≤ n ≤ 109.

[output] boolean

true if it's possible to increase n's roundness, false otherwise.
 */
