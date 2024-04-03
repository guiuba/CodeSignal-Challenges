package arcade;

public class alphabeticShift {
    public static void main(String[] args) {
    String s = "crazy";
        System.out.println(solution(s));
    }
    static String solution(String inputString) {
        StringBuilder sb = new StringBuilder();
        char[] chars = inputString.toCharArray();
        for (char c : chars) {
            if(c == 'z') {
                sb.append(String.valueOf('a'));
            } else {
                sb.append(String.valueOf(++c));
            }

        }
    return sb.toString();
    }
}

/*
Given a string, your task is to replace each of its characters by the next
one in the English alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).

Example

For inputString = "crazy", the output should be solution(inputString) = "dsbaz".
 */
