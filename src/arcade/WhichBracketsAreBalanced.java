package arcade;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class WhichBracketsAreBalanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String[] input = scan.nextLine().split("");
        try {
            for (String element : input) {
                if ("(".equals(element) ||
                        "{".equals(element) ||
                        "[".equals(element)) {
                    stack.push(element);
                }
                if (")".equals(element) && "(".equals(stack.peek()) ||
                        "}".equals(element) && "{".equals(stack.peek()) ||
                        "]".equals(element) && "[".equals(stack.peek())) {
                    stack.pop();
                }

            }
        } catch (EmptyStackException e) {
            System.out.println("false");
            return;
        }
        System.out.println(stack.isEmpty());

    }
}
