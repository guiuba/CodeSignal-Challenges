package theCore;

public class IsPower {
    public static void main(String[] args) {
        //     int n = 125;  //true
  //      int n = 72;  //false
        int n = 1;  //false
        System.out.println(solution(n));

    }

    static boolean solution(int n) {
        if(n == 1) return true;
        for (int num = 2; num < n; num++) {
            for (int power = 2; power < n; power++) {
                int res = (int) Math.pow(num, power);
                if (res > n) {
                    break;
                } else if (res == n) {
                    return true;
                }
            }
        }
        return false;
    }
}


/*
colega: return IntStream.range(0,n).mapToObj(i->IntStream.range(0,n).mapToObj(j->Math.pow(i,j)==n).anyMatch(k->k==true)).anyMatch(i->i==true);
Determine if the given number is a power of some non-negative integer.

Example

For n = 125, the output should be
solution(n) = true;
For n = 72, the output should be
solution(n) = false.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

A positive integer.

Guaranteed constraints:
1 ≤ n ≤ 400.

[output] boolean

true if n can be represented in the form ab (a to the power of b) where a and b are some non-negative
integers and b ≥ 2, false otherwise.
 */