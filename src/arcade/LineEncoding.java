package arcade;

import java.util.Map;
import java.util.TreeMap;

public class LineEncoding {
    public static void main(String[] args) {
      //  String s = "aabbbc";
        String s = "abbcabb"; // "a2bca2b"
        System.out.println(solution(s));
    }
    static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int counter = 1;

        for (int i = 0; i < s.length(); i++) {
            String sS = String.valueOf(s.charAt(i));
            if (i + 1 < s.length()) {
                if (sS.equals(String.valueOf(s.charAt(i + 1)))) {
                    counter++;
                } else {
                    String value = counter == 1 ? "" : counter + "";
                    sb.append(value).append(sS);
                    counter = 1;
                }
            } else {
                String value = counter == 1 ? "" : counter + "";
                sb.append(value).append(sS);
            }
        }
        return sb.toString();
    }
}

/*
solucao colega:
    Matcher m = Pattern.compile("([a-z])\\1*").matcher(s);
    String result = "";
    while(m.find()){
        int len = m.group(0).length();
        char cha = m.group(0).charAt(0);
        result += (len==1?"":len) + "" + cha;
    }
    return result;
 */

/*
     Map<String, Integer> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        for (String sS : s.split("")) {
            if (!map.containsKey(sS)) {
                map.put(sS, 1);
            } else {
                map.replace(sS, map.get(sS) + 1);
            }
        }
        for (var entry : map.entrySet()) {
            String value = entry.getValue() == 1 ? "" : String.valueOf(entry.getValue());
            sb.append(value + entry.getKey());
        }
        return sb.toString();
 */

/*
Given a string, return its encoding defined as follows:

First, the string is divided into the least possible number of
disjoint substrings consisting of identical characters
for example, "aabbbc" is divided into ["aa", "bbb", "c"]
Next, each substring with length greater than one is replaced
with a concatenation of its length and the repeating character
for example, substring "bbb" is replaced by "3b"
Finally, all the new strings are concatenated together in the
same order and a new string is returned.
Example

For s = "aabbbc", the output should be
solution(s) = "2a3bc".

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string s

String consisting of lowercase English letters.

Guaranteed constraints:
4 ≤ s.length ≤ 15.

[output] string

Encoded version of s.
 */