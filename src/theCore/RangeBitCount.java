package theCore;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RangeBitCount {
    public static void main(String[] args) {
        int a = 2, b = 7;
        System.out.println(solution(a, b));
    }

    static int solution(int a, int b) {


        return IntStream.rangeClosed(a, b).map(Integer::bitCount).sum();
  /*
  int counter = 0;
  for (int i = a; i <= b; i++) {
          String s = Integer.toBinaryString(i);
          for (int j = 0; j < s.length(); j++) {
              if(s.charAt(j) == '1') {
                  counter++;
              }
          }
           //      Stream.of(Integer.toBinaryString(i).//toCharArray()).map(chars -> {if (chars == 1})
        }
        return res;
        */

    }
}

/*
You are given two numbers a and b where 0 ≤ a ≤ b. Imagine you construct an array of
all the integers from a to b inclusive. You need to count the number of 1s in the
binary representations of all the numbers in the array.

Example

For a = 2 and b = 7, the output should be
solution(a, b) = 11.

Given a = 2 and b = 7 the array is: [2, 3, 4, 5, 6, 7]. Converting the numbers to binary,
 we get [10, 11, 100, 101, 110, 111], which contains 1 + 2 + 1 + 2 + 2 + 3 = 11 1s.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer a

Guaranteed constraints:
0 ≤ a ≤ b.

[input] integer b

Guaranteed constraints:
a ≤ b ≤ 10.

[output] integer

[Java] Syntax Tips
 */