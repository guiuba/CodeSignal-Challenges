package arcade;

public class ValidTime {
    public static void main(String[] args) {
        //  String time = "13:58"; // true
        //  String time = "25:51"; // false
        //   String time = "02:76"; // false
        String time = "24:00"; // false

        System.out.println(solution(time));
    }

    static boolean solution(String time) {
        String regex = "([0-1][0-9]|2[0-3]):[0-5][0-9]";
        return time.matches(regex);
    }
}

/*
Check if the given string is a correct time representation of the 24-hour clock.

Example

For time = "13:58", the output should be
solution(time) = true;
For time = "25:51", the output should be
solution(time) = false;
For time = "02:76", the output should be
solution(time) = false.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string time

A string representing time in HH:MM format. It is guaranteed that the first two characters, as well as the last two characters, are digits.

[output] boolean

true if the given representation is correct, false otherwise.
 */