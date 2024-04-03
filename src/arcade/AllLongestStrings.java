package arcade;

import java.util.stream.Stream;

public class AllLongestStrings {
    public static void main(String[] args) {

     String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        System.out.println(solution(inputArray));
    }
    static String[]  solution(String[] inputArray) {  //


        int max = Stream.of(inputArray).map(String::length).max(Integer::compareTo).get();
        return Stream.of(inputArray)
                .filter(s -> s.length() == max)
                .toArray(String[]::new);
    }
}

/*
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
solution(inputArray) = ["aba", "vcd", "aba"].

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 10.

[output] array.string

Array of the longest strings, stored in the same order as in the inputArray.
 */