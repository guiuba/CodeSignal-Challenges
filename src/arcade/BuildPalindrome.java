package arcade;

public class BuildPalindrome {
    public static void main(String[] args) {
        String st = "abcdc"; // solution(st) = "abcdcba"

        System.out.println(solution(st));
    }
    static String solution(String st) {
        StringBuilder stReversed = new StringBuilder(st).reverse();
        if (isPalindrome(st)) {
            return st;
        }
        StringBuilder solution = new StringBuilder();
        for (int i = stReversed.length() - 1 ; i >= 0; i--) {
            String aux = stReversed.substring(i);
            if(isPalindrome(st + aux)) {
              solution.append(st).append(aux);
              break;

            }
        }
         return  solution.toString();
    }

    static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
/* solução colega
        String rs = new StringBuffer(st).reverse().toString();

        for (int i = 0; i < st.length(); i++) {

		if (rs.startsWith(st.substring(i))) {
			//System.out.println(rs + " :: " + st.substring(i));
			return st.substring(0, i) + rs;
		}
	}

	return "?";
 */

/*
Given a string, find the shortest possible string which can be
achieved by adding characters to the end of initial string to make it a palindrome.

Example

For st = "abcdc", the output should be
solution(st) = "abcdcba".

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string st

A string consisting of lowercase English letters.

Guaranteed constraints:
3 ≤ st.length ≤ 10.

[output] string

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