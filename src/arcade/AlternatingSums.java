package arcade;

import java.util.Arrays;
import java.util.stream.Stream;

public class AlternatingSums {
    public static void main(String[] args) {
        int[] a = {50, 60, 60, 45, 70};
        System.out.println(Arrays.toString(solution(a)));
    }
    static int[] solution(int[] a) {
        int sumOdds = 0;
        int sumEvens = 0;
        for (int i = 0; i < a.length; i++) {
            if(i % 2 == 0) {
                sumEvens += a[i];
            } else {
                sumOdds += a[i];
            }
        }
        return new int[]{sumEvens, sumOdds};
    }
}

/* solução boa de algum colega
   int []niz = new int[2];

    for(int i=0; i<a.length; i++)
        niz[i%2]+=a[i];

    return niz;
 */

/*
Several people are standing in a row and need to be divided into two teams.
The first person goes into team 1, the second goes into team 2, the third
goes into team 1 again, the fourth into team 2, and so on.

You are given an array of positive integers - the weights of the people.
Return an array of two integers, where the first element is the total weight
of team 1, and the second element is the total weight of team 2 after the division is complete.

Example

For a = [50, 60, 60, 45, 70], the output should be
solution(a) = [180, 105].

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 105,
45 ≤ a[i] ≤ 100.
 */