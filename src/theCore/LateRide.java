package theCore;

import java.time.LocalTime;

public class LateRide {
    public static void main(String[] args) {
      //  int n = 240; // 4
      //     int n = 808; // 14
         int n = 1439; // 19
        System.out.println(solution(n));
    }

    static int solution(int n) {

        int hh = n / 60;
        int mm = n % 60;
        return (hh / 10) + (hh % 10) + (mm / 10) + (mm % 10);
        //   System.out.println(n / 60);
    /*    double hour = n / 60.0; // Math.ceil(n / 60.0)

        System.out.println(hour);
        System.out.println((int) Math.ceil(hour));
        LocalTime time = LocalTime.ofSecondOfDay(n * 60);
        System.out.println(time);
        String[] timeDigits = String.valueOf(time).split("");
        System.out.println(Integer.parseInt(timeDigits[0]) +
                Integer.parseInt(timeDigits[1]) +
                Integer.parseInt(timeDigits[3]) +
                Integer.parseInt(timeDigits[4]));
        return (int) hour;*/

    }
}

/*
One night you go for a ride on your motorcycle. At 00:00 you start your engine,
and the built-in timer automatically begins counting the length of your ride, in minutes.
Off you go to explore the neighborhood.

When you finally decide to head back, you realize there's a chance the bridges on your
route home are up, leaving you stranded! Unfortunately, you don't have your watch on you
and don't know what time it is. All you know thanks to the bike's timer is that n minutes
have passed since 00:00.

Using the bike's timer, calculate the current time. Return an answer as the sum of digits
that the digital timer in the format hh:mm would show.

Example

For n = 240, the output should be
solution(n) = 4.

Since 240 minutes have passed, the current time is 04:00. The digits sum up to
0 + 4 + 0 + 0 = 4, which is the answer.

For n = 808, the output should be
solution(n) = 14.

808 minutes mean that it's 13:28 now, so the answer should be 1 + 3 + 2 + 8 = 14.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

The duration of your ride, in minutes. It is guaranteed that you've been riding for
less than a day (24 hours).

Guaranteed constraints:
0 ≤ n < 60 · 24.

[output] integer

The sum of the digits the digital timer would show.
 */
