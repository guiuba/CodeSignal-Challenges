package arcade;

import java.math.BigInteger;

public class MessageFromBinaryCode {
    public static void main(String[] args) {
        String code = "010010000110010101101100011011000110111100100001";
        System.out.println(solution(code));
    }
    static String solution(String code) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i += 8){
            sb.append(Character.toString(Integer.parseInt(code.substring(i, i + 8), 2)));
        }
        return sb.toString();
    }
}

/*
colega:
return new String(new BigInteger(code, 2).toByteArray());
You are taking part in an Escape Room challenge designed
specifically for programmers. In your efforts to find a clue,
you've found a binary code written on the wall behind a vase,
and realized that it must be an encrypted message. After some
thought, your first guess is that each consecutive 8 bits of
the code stand for the character with the corresponding extended ASCII code.

Assuming that your hunch is correct, decode the message.

Example

For code = "010010000110010101101100011011000110111100100001", the output should be
solution(code) = "Hello!".

The first 8 characters of the code are 01001000, which is 72 in the
binary numeral system. 72 stands for H in the ASCII-table, so the first letter is H.
Other letters can be obtained in the same manner.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string code

A string, the encrypted message consisting of characters '0' and '1'.

Guaranteed constraints:
0 < code.length < 800.

[output] string

The decrypted message.
 */