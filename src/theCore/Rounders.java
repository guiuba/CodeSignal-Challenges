package theCore;

public class Rounders {
    public static void main(String[] args) {
        int n = 5;
      //  int n = 14; // 10
     //   int n = 10; // 10
       //    int n = 15; // 20
    //    int n = 1234;
    //    int n = 1445;
   //     int n = 7001; // 7000
   //     int n = 99; // 100
        System.out.println(solution(n));

    }
    static int solution(int value) {
        return value < 10 ? value : value % 10 >= 5 ? solution(value / 10 + 1) * 10 : solution(value / 10) * 10;


/*        StringBuilder num = new StringBuilder(String.valueOf(n));
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (digit >= 5) {
                if (i - 1 >= 0) {
                    String oneBefore = Integer.parseInt(String.valueOf(num.charAt(i - 1))) + 1 + "";
                    num.replace(i - 1, i + 1, oneBefore + "0");
                 //   break;
                } else {
                    num.replace(i , i + 1,"10");
                    break;
                }
           //     num.insert(i, "10");
            }
            if (digit > 0) {
                num.replace(i , i + 1,"0");
                if (i - 1 == 0 && Integer.parseInt(String.valueOf(num.charAt(0))) > 0) {
                    break;
                }
            }
             if (digit == 0) {
                return Integer.parseInt(num.toString());
            }
        }

        return Integer.parseInt(num.toString());*/
    }
}

/* colega:
 return value < 10 ? value : value % 10 >= 5 ? solution(value / 10 + 1) * 10 : solution(value / 10) * 10;

We want to turn the given integer into a number that has only one non-zero digit
using a tail rounding approach. This means that at each step we take the last
non 0 digit of the number and round it to 0 or to 10. If it's less than 5 we
round it to 0 if it's larger than or equal to 5 we round it to 10 (rounding to
10 means increasing the next significant digit by 1). The process stops immediately
once there is only one non-zero digit left.

Example

For n = 15, the output should be
solution(n) = 20;

For n = 1234, the output should be
solution(n) = 1000.

1234 -> 1230 -> 1200 -> 1000.

For n = 1445, the output should be
solution(n) = 2000.

1445 -> 1450 -> 1500 -> 2000.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

A positive integer.

Guaranteed constraints:
1 ≤ value ≤ 108.

[output] integer

The rounded number.
 */
