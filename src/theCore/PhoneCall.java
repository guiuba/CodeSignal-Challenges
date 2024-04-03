package theCore;

public class PhoneCall {
    public static void main(String[] args) {
        //    int min1 = 3, min2_10 = 1, min11 = 2, s = 20; //14
        //     int min1 = 2, min2_10 = 2, min11 = 1, s = 2; //1
        //    int min1 = 10, min2_10 = 1, min11 = 2, s = 22; //11
        int min1 = 1, min2_10 = 2, min11 = 1, s = 6; //3
        System.out.println(solution(min1, min2_10, min11, s));
    }

    static int solution(int min1, int min2_10, int min11, int s) {
        int counter = 0;
        boolean tenMinCall = false;
        if (s >= min1) {
            s -= min1;
            counter++;
        }
        for (int i = 0; i < 9; i++) {
            if (s >= min2_10) {
                s -= min2_10;
                counter++;
                if (i == 8) {
                    tenMinCall = true;
                }
            }
        }
        if (tenMinCall) {
            while (s >= min11) {
                s -= min11;
                counter++;
            }
        }
        return counter;
    }
}

/*
solução colega:
   int t1=min1+ min2_10*9;
    if (s>=t1){
        return 10+(s-t1)/min11;
    }
    if (s>=min1){
        return (s-min1)/min2_10+1;
    }
    return 0;
Some phone usage rate may be described as follows:

first minute of a call costs min1 cents,
each minute from the 2nd up to 10th (inclusive) costs min2_10 cents
each minute after 10th costs min11 cents.
You have s cents on your account before the call. What is the duration of
the longest call (in minutes rounded down to the nearest integer) you can have?

Example

For min1 = 3, min2_10 = 1, min11 = 2, and s = 20, the output should be
solution(min1, min2_10, min11, s) = 14.

Here's why:

the first minute costs 3 cents, which leaves you with 20 - 3 = 17 cents;
the total cost of minutes 2 through 10 is 1 * 9 = 9, so you can talk 9 more minutes
and still have 17 - 9 = 8 cents;
each next minute costs 2 cents, which means that you can talk 8 / 2 = 4 more minutes.
Thus, the longest call you can make is 1 + 9 + 4 = 14 minutes long.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer min1

Guaranteed constraints:
1 ≤ min1 ≤ 10.

[input] integer min2_10

Guaranteed constraints:
1 ≤ min2_10 ≤ 10.

[input] integer min11

Guaranteed constraints:
1 ≤ min11 ≤ 10.

[input] integer s

Guaranteed constraints:
2 ≤ s ≤ 500.

[output] integer
 */
