package arcade;

public class isLucky {
    public static void main(String[] args) {
   //     int n = 1230;
        int n = 239017;
        System.out.println(solution(n));
    }

    static boolean solution(int n) {
        String aux = String.valueOf(n);
        String aux2 = aux.substring(0, aux.length() / 2);
        String aux3 = aux.substring(aux.length() / 2);
        int firstHalf = 0;
        int secondHalf = 0;
        for (int i = 0; i < aux2.length(); i++) {
            firstHalf += Integer.parseInt(String.valueOf(aux2.charAt(i)));
        }

        for (int i = 0; i < aux3.length(); i++) {
            secondHalf += Integer.parseInt(String.valueOf(aux3.charAt(i)));
        }

        return firstHalf == secondHalf;
    }

    boolean solution2(int n) {

        String s = n+"";
        int sum = 0;

        for(int i=0; i<s.length()/2; i++)
            sum+=(s.charAt(i)-s.charAt(s.length()-1-i));

        return sum==0;
    }
}

/*
Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky
if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
solution(n) = true;
For n = 239017, the output should be
solution(n) = false.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 ≤ n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.
 */