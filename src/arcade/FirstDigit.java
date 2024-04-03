package arcade;

public class FirstDigit {
    public static void main(String[] args) {
        String inputString = "0ss"; //"q2q-q"; //"var_1__Int";
        System.out.println(solution(inputString));
    }

    static char solution(String inputString) {
        //  return inputString.replaceAll("[^0-9]","").charAt(0);
        char[] charArray = inputString.toCharArray();
        char firstDigit = '0';
        for(char c : charArray) {
            if(Character.isDigit(c)) {
                firstDigit = c;
                break;
            }
        }
        return firstDigit;
    }
}

/*
Find the leftmost digit that occurs in a given string.

Example

For inputString = "var_1__Int", the output should be
solution(inputString) = '1';
For inputString = "q2q-q", the output should be
solution(inputString) = '2';
For inputString = "0ss", the output should be
solution(inputString) = '0'.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string inputString

A string containing at least one digit.

Guaranteed constraints:
3 ≤ inputString.length ≤ 10.

[output] char
 */
