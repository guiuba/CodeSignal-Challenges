package arcade;

import java.util.Stack;

public class reverseInParentheses {
    public static void main(String[] args) {
    //    String toReverse = "foo(bar)baz";
        //   String toReverse = "(bar)";
        //     String toReverse = "foo(bar)baz(blim)";
        //     String toReverse = "foo(bar(baz))blim";
        //    String toReverse = "";
            String toReverse = "()";
        System.out.println(solution(toReverse));
    }

    static String solution(String inputString) {

        StringBuilder sb = new StringBuilder();
        if (inputString.contains("(")) {
            int firstInd = inputString.lastIndexOf("(");
            int lastInd = firstInd + inputString.substring(firstInd).indexOf(")");
            sb.append(inputString, 0, firstInd);
            sb.append(new StringBuilder(inputString.substring(firstInd + 1, lastInd)).reverse());
            sb.append(inputString.substring(lastInd + 1));
        }
        if (!sb.toString().contains("(")) {
            if (sb.isEmpty()) {
                return "()".equals(inputString) ? "" : inputString;
            }
            return sb.toString();
        }
        return solution(sb.toString());
    }
}

/*
StringBuilder str = new StringBuilder(inputString);
    int start, end;
    while(str.indexOf("(") != -1){
        start = str.lastIndexOf("(");
        end = str.indexOf(")", start);
        str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
    }
    return str.toString();
 */