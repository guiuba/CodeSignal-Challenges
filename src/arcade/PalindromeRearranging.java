package arcade;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {
    public static void main(String[] args) {
     //   String inputString = "aabb";
     //   String inputString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
        String inputString = "abbcabb";
  //      String inputString = "zyyzzzzz";
        System.out.println(solution(inputString));

    }
    static boolean solution(String inputString) {
       int oddCounter = 0;
        Map<Character, Integer> elements = new HashMap<>();
        for(int i = 0; i < inputString.length(); i++) {
            char element = inputString.charAt(i);
            if(elements.containsKey(element)) {
                elements.replace(element, elements.get(element) + 1);
            } else {
                elements.put(element, 1);
            }
        }

      for(Integer i : elements.values()) {
          if (i % 2 != 0) {
              oddCounter++;
          }
      }
        return oddCounter < 2;

    }
}

/*
For inputString = "aabb", the output should be
solution(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string inputString

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 50.

[output] boolean

true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.

[Java] Syntax Tips

// Prints help message to the console
// Returns a string
//
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
    System.out.println("This prints to the console when you Run Tests");
    return "Hello, " + name;
}
 */