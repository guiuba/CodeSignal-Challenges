package theCore;

public class CountSumofTwoRepresentations2 {
    public static void main(String[] args) {

        int n = 6, l = 2, r = 4; // 2

        System.out.println(solution(n, l, r));
    }
    static int solution(int n, int l, int r) {
        //              6              2           6-4
        //                             2            2
        //              6/2+1 -2
   //     return Math.max(n/2+1-Math.max(l, Math.max(n-r,0)),0);

        int t = 0;
        //           2       4
        for (int i = l; i <= r; i++) {
            //  6-2 >= 2 && 6-2 <= 4 true
            //  6-3 >= 3 && 6-3 <= 4 true
            //  6-4 >= 4 && 6-4 <= 4 false
            if (n-i >= i && n-i <= r)
                t++;
        }
        return t;

/*    my solution not optimized
      int counter = 0;
        for(int i = l; i <= r; i++) {
            for(int j = i; j <= r; j++) {
              if(i + j == n) {
                  counter++;
              }
            }
        }
        return counter;*/
    }
}

/*
Given integers n, l and r, find the number of ways to represent n as a sum of two integers
A and B such that l ≤ A ≤ B ≤ r.

Example

For n = 6, l = 2, and r = 4, the output should be
solution(n, l, r) = 2.

There are just two ways to write 6 as A + B, where 2 ≤ A ≤ B ≤ 4: 6 = 2 + 4 and 6 = 3 + 3.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

A positive integer.

Guaranteed constraints:
5 ≤ n ≤ 109.

[input] integer l

A positive integer.

Guaranteed constraints:
1 ≤ l ≤ r.

[input] integer r

A positive integer.

Guaranteed constraints:
l ≤ r ≤ 109,
r - l ≤ 106.
 */
