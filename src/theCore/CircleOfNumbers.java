package theCore;

public class CircleOfNumbers {
    public static void main(String[] args) {
          int n = 10, firstNumber = 2; // 7
    //    int n = 10, firstNumber = 7; // 2
     //   int n = 4, firstNumber = 1; // 3
    //    int n = 6, firstNumber = 3; // 0
        System.out.println(solution(n, firstNumber));
    }

    static int solution(int n, int firstNumber) {

        return n/2 + firstNumber < n ?  n/2 + firstNumber : n/2 + firstNumber == n ? 0 : firstNumber % (n / 2);
    }
}

/*
solução colega: return (firstNumber + n/2) % n;
Consider integer numbers from 0 to n - 1 written down along the circle in
such a way that the distance between any two neighboring numbers is equal
(note that 0 and n - 1 are neighboring, too).

Given n and firstNumber, find the number which is written in the radially
opposite position to firstNumber.

Example

For n = 10 and firstNumber = 2, the output should be
solution(n, firstNumber) = 7.
 */
