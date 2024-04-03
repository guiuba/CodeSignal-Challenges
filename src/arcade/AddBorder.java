package arcade;

import java.util.Arrays;

public class AddBorder {
    public static void main(String[] args) {
        String[] picture = {"abc", "ded"};
        System.out.println(Arrays.toString(solution(picture)));
    }

    static String[] solution(String[] picture) {
        String[] pictureWithBorder = new String[picture.length + 2];
        int colLength = picture[0].length();
        pictureWithBorder[0] = "*".repeat(colLength + 2);
        pictureWithBorder[pictureWithBorder.length - 1] = "*".repeat(colLength + 2);
        for (int i = 1; i < pictureWithBorder.length - 1; i++) {
            pictureWithBorder[i] = "*" + picture[i - 1] + "*";
        }
          return pictureWithBorder;
    }
}

/*
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

solution(picture) = ["*****",
                     "*abc*",
                     "*ded*",
                     "*****"]
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 ≤ picture.length ≤ 100,
1 ≤ picture[i].length ≤ 100.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1.
 */