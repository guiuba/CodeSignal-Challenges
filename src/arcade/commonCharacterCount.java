package arcade;

public class commonCharacterCount {
    public static void main(String[] args) {
        String s1 = "aabcc",  s2 = "adcaa";
        System.out.println(solution(s1, s2));
    }

    static int solution(String s1, String s2) {
        var count = 0;
        for(var i = 0; i < s1.length(); i++) {
            var j = s2.indexOf(s1.charAt(i));
            if(j>=0){
                count++;
                s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)),"");
            }
        }
        return count;

    }

}

/*
Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string s1

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s1.length < 15.

[input] string s2

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s2.length < 15.

[output] integer
 */