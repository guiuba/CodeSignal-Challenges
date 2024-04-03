package theCore;

public class IsInfiniteProcess {
    public static void main(String[] args) {
   //     int a = 2, b = 6; // false
        int a = 2, b = 3; // true
        System.out.println(solution(a, b));

    }
    static boolean solution(int a, int b) {
        return a > b || (b + a) % 2 != 0;
    }
}

/*
Given integers a and b, determine whether the following pseudocode results in an infinite loop

while a is not equal to b do
  increase a by 1
  decrease b by 1
Assume that the program is executed on a virtual machine which can store arbitrary long numbers and execute forever.

Example

For a = 2 and b = 6, the output should be
solution(a, b) = false;
For a = 2 and b = 3, the output should be
solution(a, b) = true.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer a

Guaranteed constraints:
0 ≤ a ≤ 20.

[input] integer b

Guaranteed constraints:
0 ≤ b ≤ 20.

[output] boolean

true if the pseudocode will never stop, false otherwise.
 */