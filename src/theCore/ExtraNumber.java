package theCore;

public class ExtraNumber {
    public static void main(String[] args) {
        int a = 2, b = 7,  c = 2;
        System.out.println(solution(a, b, c));

    }
    static int solution(int a, int b, int c) {

        return a == b ? c : a == c ? b : a;
    }
}

/*
You're given three integers, a, b and c. It is guaranteed that two of
these integers are equal to each other. What is the value of the third integer?

Example

For a = 2, b = 7, and c = 2, the output should be
solution(a, b, c) = 7.

The two equal numbers are a and c. The third number (b) equals 7, which is the answer.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer a

Guaranteed constraints:
1 ≤ a ≤ 109.

[input] integer b

Guaranteed constraints:
1 ≤ b ≤ 109.

[input] integer c

Guaranteed constraints:
1 ≤ c ≤ 109.

[output] integer

[Java] Syntax Tips
 */