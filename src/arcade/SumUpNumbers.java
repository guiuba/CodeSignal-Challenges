package arcade;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumUpNumbers {
    public static void main(String[] args) {

        //    String inputString = "abc";
     //   String inputString = "2 apples, 12 oranges"; // 14
  //       String inputString = "123450"; // "123450"
        //  String inputString = "Your payment method is invalid"; // 0
            String inputString = "there are some (12) digits 5566 in this 770 string 239"; // 6587
        System.out.println(solution(inputString));
    }

    static int solution(String inputString) {
        int sum = 0;
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(inputString);
        while (m.find()) {
            sum += Integer.parseInt(m.group());
        }
        return sum;
    }
}

/*
return Arrays.stream(inputString.split("\\D+")).
        filter(s -> !s.isEmpty()).
        mapToInt(Integer::new).sum();
CodeMaster has just returned from shopping. He scanned the check of
the items he bought and gave the resulting string to Ratiorg to figure
out the total number of purchased items. Since Ratiorg is a bot he is
definitely going to automate it, so he needs a program that sums up all
the numbers which appear in the given input.

Help Ratiorg by writing a function that returns the sum of numbers that
appear in the given inputString.

Example

For inputString = "2 apples, 12 oranges", the output should be
solution(inputString) = 14.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string inputString

Guaranteed constraints:
0 ≤ inputString.length ≤ 105.

[output] integer
 */