package arcade;

public class FindEmailDomain {
    public static void main(String[] args) {
        String address = "prettyandsimple@example.com"; // example.com
        //    String address = "fully-qualified-domain@codesignal.com"; // codesignal.com
        System.out.println(solution(address));

    }

    static String solution(String address) {
        return address.substring(address.lastIndexOf("@") + 1);
    }
}


/*
An email address such as "John.Smith@example.com" is made up
of a local part ("John.Smith"), an "@" symbol, then a domain
part ("example.com").

The domain name part of an email address may only consist
of letters, digits, hyphens and dots. The local part, however,
also allows a lot of different special characters. Here you
can look at several examples of correct and incorrect email addresses.

Given a valid email address, find its domain part.

Example

For address = "prettyandsimple@example.com", the output should be
solution(address) = "example.com";
For address = "fully-qualified-domain@codesignal.com", the output should be
solution(address) = "codesignal.com".
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string address

Guaranteed constraints:
10 ≤ address.length ≤ 50.

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