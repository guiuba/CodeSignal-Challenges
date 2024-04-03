package arcade;

import java.util.stream.Stream;

public class DifferentSymbolsNaive {
    public static void main(String[] args) {
     String s = "cabca";
        System.out.println(solution(s));
    }
    static int solution(String s) {

     return (int) Stream.of(s.split("")).distinct().count();
    }
}

/*
Given a string, find the number of different characters in it.

Example

For s = "cabca", the output should be
solution(s) = 3.

There are 3 different characters a, b and c.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string s

A string of lowercase English letters.

Guaranteed constraints:
3 ≤ s.length ≤ 1000.
 */