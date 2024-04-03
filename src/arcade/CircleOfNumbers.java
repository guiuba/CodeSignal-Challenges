package arcade;

public class CircleOfNumbers {
    public static void main(String[] args) {
        int n = 10;
        int firstNumber = 2;
        System.out.println(solution(n, firstNumber));
    }

    static int solution(int n, int firstNumber) {
        if(firstNumber < n / 2)
            return firstNumber + n / 2;
        return Math.abs(firstNumber - n / 2);
       // return (firstNumber+n/2)%n;
    }
}
