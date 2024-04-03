package arcade;

import java.util.*;
import java.util.stream.Stream;

public class IsBeautifulString {
    public static void main(String[] args) {
       //    String inputString = "bbbaacdafe";
        //   String inputString = "aabbb";
        String inputString = "bbc";
        System.out.println(solution(inputString));
    }

    static boolean solution(String inputString) {
  /*      Map<Integer, Integer> map = new HashMap<>();
        char[] chars = inputString.toCharArray();
        Arrays.sort(chars);

        for (int aux : chars) {
            if (!map.containsKey(aux)) {
                map.put(aux, 1);
            } else {
                map.replace(aux, map.get(aux), map.get(aux) + 1);
            }
        }
        int key = 0;
        int value = 0;
        for (var entry : map.entrySet()) {
            if (key == 0 & value == 0) {
                if (entry.getKey() > 97) {
                    return false;
                } else {
                    key = entry.getKey();
                    value = entry.getValue();
                }

            } else {
                if (entry.getValue() > value || entry.getKey() != key + 1) {
                    return false;
                } else {
                    key = entry.getKey();
                    value = entry.getValue();
                }
            }
        }
        return true;*/
        int [] c = new int[26];

        for (int i : inputString.getBytes()) c[i-'a'] ++;



        for (int i = 1; i < 26; i ++)
            if (c[i] > c[i-1]) return false;



        return true;
    }
}

/* solução de colega:

 */

/*
A string is said to be beautiful if each letter in the string appears at most
as many times as the previous letter in the alphabet within the string; ie: b
occurs no more times than a; c occurs no more times than b; etc. Note that
letter a has no previous letter.

Given a string, check whether it is beautiful.

Example

For inputString = "bbbaacdafe", the output should be solution(inputString) = true.

This string contains 3 as, 3 bs, 1 c, 1 d, 1 e, and 1 f (and 0 of every other letter),
so since there aren't any letters that appear more frequently than the previous letter,
this string qualifies as beautiful.

For inputString = "aabbb", the output should be solution(inputString) = false.

Since there are more bs than as, this string is not beautiful.

For inputString = "bbc", the output should be solution(inputString) = false.

Although there are more bs than cs, this string is not beautiful because there are no as,
so therefore there are more bs than as.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string inputString

A string of lowercase English letters.

Guaranteed constraints:
3 ≤ inputString.length ≤ 50.

[output] boolean

Return true if the string is beautiful, false otherwise.
 */