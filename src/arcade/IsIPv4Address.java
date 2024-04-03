package arcade;

public class IsIPv4Address {
    public static void main(String[] args) {
        String inputString5 = "172.16.254.";
        String inputString = "172.16.254.1";
        String inputString2 = "64.233.161.00"; // false 00 -> 0
        String inputString3 = "64.00.161.131"; // false 00 -> 0
        String inputString4 = "01.233.161.131"; // false 01 -> 1
        System.out.println(solution(inputString));
    }

    static boolean solution(String inputString) {
        String regNumRegex = "((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])";

        return inputString.matches(regNumRegex);

    }
}

/*
An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.

Given a string, find out if it satisfies the IPv4 address naming rules.

Example

For inputString = "172.16.254.1", the output should be
solution(inputString) = true;

For inputString = "172.316.254.1", the output should be
solution(inputString) = false.

316 is not in range [0, 255].

For inputString = ".254.255.0", the output should be
solution(inputString) = false.

There is no first number.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string inputString

A string consisting of digits, full stops and lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 30.

[output] boolean

true if inputString satisfies the IPv4 address naming rules, false otherwise.
 */