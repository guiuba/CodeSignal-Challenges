package arcade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class avoidObstacles {
    public static void main(String[] args) {
     //   int[] inputArray = {5, 3, 6, 7, 9}; // 4
      //  int[] inputArray = {5, 3, 6, 7, 10};
       int[] inputArray = {1000, 999};
        System.out.println(solution(inputArray));
    }
    static int solution(int[] inputArray) {
     int jump = 2;
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] % jump == 0) {
                jump++;
                i = -1;
               // break;
            }
        }

     return jump;
    }
}


/*
        Arrays.sort(inputArray);
        int lastStep = 0;
        List<Integer> stepPoints = new ArrayList<>();
        int maxJumpLength = inputArray[inputArray.length - 1] + 1;
        System.out.println(Arrays.toString(inputArray));
        for (int i = 1; i < inputArray.length; i++) {
            if(inputArray[i] - inputArray[i - 1] >= 2) {
                int step = inputArray[i - 1] + 1;
                while (step < inputArray[i]) {
                    stepPoints.add(step);
                    step++;
                }
            //    jumpLength =  inputArray[i - 1] + 1;
            }
        }
       // List<Integer> list = Stream.of(Arrays.asList().).sorted().collect(Collectors.toList());//Stream.of(inputArray)
        System.out.println(stepPoints);
        System.out.println(5 % 2);
        return  maxJumpLength;
 */


/*
You are given an array of integers representing coordinates of obstacles situated on a straight line.

Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make
jumps of the same length represented by some integer.

Find the minimal length of the jump enough to avoid all the obstacles.

Example

For inputArray = [5, 3, 6, 7, 9], the output should be
solution(inputArray) = 4.

Check out the image below for better understanding:

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.integer inputArray

Non-empty array of positive integers.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 1000,
1 ≤ inputArray[i] ≤ 1000.

[output] integer

The desired length.
 */