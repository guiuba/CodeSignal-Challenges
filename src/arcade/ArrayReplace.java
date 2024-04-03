package arcade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ArrayReplace {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 1};
        int elemToReplace = 1;
        int substitutionElem = 3;
        System.out.println(Arrays.toString(solution(inputArray, elemToReplace, substitutionElem)));
    }
    static int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        return Arrays.stream(inputArray)
                .map(elem -> elem == elemToReplace ? substitutionElem : elem)
                .toArray();
  /*      for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == elemToReplace)
                inputArray[i] = substitutionElem;
        }
        return inputArray;*/

    }
}

/*
Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.

Example

For inputArray = [1, 2, 1], elemToReplace = 1, and substitutionElem = 3, the output should be
solution(inputArray, elemToReplace, substitutionElem) = [3, 2, 3]
 */