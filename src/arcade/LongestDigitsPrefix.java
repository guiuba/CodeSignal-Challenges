package arcade;

public class LongestDigitsPrefix {
    public static void main(String[] args) {
        String inputString = "123aa1";
        System.out.println(solution(inputString));
    }

    static String solution(String inputString) {
        StringBuilder sb = new StringBuilder();
        if (!Character.isDigit(inputString.charAt(0)))
            return "";
        else {
            for (int i = 0; i < inputString.length(); i++) {
                if (Character.isDigit(inputString.charAt(i))) {
                    sb.append(inputString.charAt(i));
                } else {
                    break;
                }
            }
        }
        return sb.toString();
    }
}

/*
Given a string, output its longest prefix which contains only digits.

Example

For inputString = "123aa1", the output should be
solution(inputString) = "123".

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string inputString

Guaranteed constraints:
3 ≤ inputString.length ≤ 100.


 */

/* solução de algum colega
    for(int i = 0;i<inputString.length();i++){
        if(!(Character.isDigit(inputString.charAt(i)))){
            return inputString.substring(0,i);
        }
    }
    return inputString;
 */