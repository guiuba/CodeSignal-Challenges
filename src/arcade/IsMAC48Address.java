package arcade;

public class IsMAC48Address {
    public static void main(String[] args) {
        String inputString = "00-1B-63-84-45-E6";
      //  String inputString = "02-03-04-05-06-07-";
  //      String inputString = "AB-CD-EF-12-34_56";
  //      String inputString = "23-25-E4-39-40-11-";
     //   String inputString = "0-12-34-56-78-9A"; //false
        // "02-03-04-05-06-070"; false
        // "00--00-00-00-00-00"; false
        //  String regex = "([0-9][A-F]|[A-F][0-9])-{5}([0-9][A-F]|[A-F][0-9])";
        //    String regex = "([0-9]{1,2}|[A-F]{1,2}|[0-9][A-F]|[A-F][0-9])-{5}([0-9]{1,2}|[A-F]{1,2}|[0-9][A-F]|[A-F][0-9])";
        //    String regex = "1234-56-78-9A-BC";
        //"12-34-56-78-9A-"; false
        //"12.34.56.78.9A.BC"; // false
        //"-----------------"; // false
      //  System.out.println('-' == inputString.charAt(inputString.length()- 1));
      //  System.out.println("E6".matches("([0-9]{1,2}|[A-F]{1,2}|[0-9][A-F]|[A-F][0-9])"));

        System.out.println(solution(inputString));
    }
    static boolean solution(String inputString) {
        if('-'== inputString.charAt(inputString.length()- 1) ||
                '-'== inputString.charAt(0)) {
            return false;
        }
        //"([0-9][A-F]|[A-F][0-9])"  ;
        String regex = "([0-9]{1,2}|[A-F]{1,2}){2}|[0-9][A-F]|[A-F][0-9]";   // "00-1B-63-84-45-E6"
        String[] inputStringArray = inputString.split("-");
        boolean approved = true;
        for (String s : inputStringArray) {
            if (!s.matches(regex)){
                approved = false;
                break;
            }
            if(s.length() != 2) {
                approved = false;
                break;
            }
        }
           return  approved;
     //   return inputString.matches(regex);
    }
}

/*
solução colega
return inputString.matches("([0-9A-F][0-9A-F]-){5}[0-9A-F][0-9A-F]");
A media access control address (MAC address) is a unique identifier
assigned to network interfaces for communications on the physical network segment.

The standard (IEEE 802) format for printing MAC-48 addresses in
human-friendly form is six groups of two hexadecimal digits (0 to 9 or A to F),
separated by hyphens (e.g. 01-23-45-67-89-AB).

Your task is to check by given string inputString whether it corresponds to MAC-48 address or not.

Example

For inputString = "00-1B-63-84-45-E6", the output should be
solution(inputString) = true;
For inputString = "Z1-1B-63-84-45-E6", the output should be
solution(inputString) = false;
For inputString = "not a MAC-48 address", the output should be
solution(inputString) = false.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string inputString

Guaranteed constraints:
15 ≤ inputString.length ≤ 20.

[output] boolean

true if inputString corresponds to MAC-48 address naming rules, false otherwise.
 */
