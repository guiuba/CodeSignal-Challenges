package arcade;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestWord {
    public static void main(String[] args) {
        //     String text = "Ready, steady, go!";
        String text = "ab-CDE-fg_hi"; //"aa bbb ccc dddd eeeee"; //"Ready[[[, steady, go!";
        System.out.println(solution(text));
    }

    static String solution(String text) {
        String[] aux = text.replaceAll("[^a-zA-Z]", " ").split(" ");
        int longest = 0;
        int index = 0;
        for (int i = 0; i < aux.length; i++) {
            if (aux[i].length() > longest) {
                longest = aux[i].length();
                index = i;
            }
        }
        return aux[index];
    }
}
/*
 return Arrays.stream(text.split("\\W+")).max((a, b) -> a.length() - b.length()).get();

Define a word as a sequence of consecutive English letters. Find the longest word from the given string.

Example

For text = "Ready, steady, go!", the output should be
solution(text) = "steady".

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string text

Guaranteed constraints:
4 ≤ text.length ≤ 50.

[output] string

The longest word from text. It's guaranteed that there is a unique output.
 */