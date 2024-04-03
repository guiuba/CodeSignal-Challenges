package arcade;

import java.util.*;

public class FileNaming {
    public static void main(String[] args) {
     //   String[] names = {"doc", "doc", "image", "doc(1)", "doc"};
        //    solution(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"]"
      //     String[] names = {"a(1)", "a(6)", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"};
//      solution(names) = ["a(1)","a(6)","a","a(2)","a(3)","a(4)","a(5)","a(7)","a(8)", "a(9)", "a(10)", "a(11)"]
             String[] names = {"dd","dd(1)","dd(2)","dd","dd(1)","dd(1)(2)","dd(1)(1)","dd","dd(1)"};
        //  solution(names) = ["dd","dd(1)","dd(2)","dd(3)","dd(1)(1)","dd(1)(2)","dd(1)(1)(1)","dd(4)","dd(1)(3)"]

        System.out.println(Arrays.toString(solution(names)));

    }

    static String[] solution(String[] names) {
        String[] namesResult = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            if (!Arrays.asList(namesResult).contains(names[i])) {
                namesResult[i] = names[i];
            } else {
                int counter = 1;
                String aux = String.format("%s(%d)", names[i], counter);
                if(!Arrays.asList(namesResult).contains(aux)) {
                    namesResult[i] = aux;
                } else {
                   while(counter <= 1000) {
                       aux = String.format("%s(%d)", names[i], ++counter);
                       if (!Arrays.asList(namesResult).contains(aux)) {
                           namesResult[i] = aux;
                           break;
                       }
                   }
                }
            }
        }
    //    System.out.println(Arrays.toString(names));
        return namesResult;
    }
}

/*
colega:
  List<String> input = Arrays.asList(names);
    List<String> result = new ArrayList<>();
    for( String s : names ){
        if(result.contains(s)){
            int i = 1;
            for(; result.contains(s+"("+i+")") ;i++){

            }
            s+="("+i+")";
        }
        result.add(s);
    }
    return result;
You are given an array of strings names representing filenames.
The array is sorted in order of file creation, such that names[i]
represents the name of a file created before names[i+1] and after
names[i-1] (assume 0-based indexing). Because all files must have
unique names, files created later with the same name as a file
created earlier should have an additional (k) suffix in their names,
where k is the smallest positive integer (starting from 1) that does
not appear in previous file names.

Your task is to iterate through all elements of names (from left to right)
and update all filenames based on the above. Return an array of proper filenames.

Example

For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be
solution(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"].

Since names[0] = "doc" and names[1] = "doc", update names[1] = "doc(1)"
Since names[1] = "doc(1)" and names[3] = "doc(1)", update names[3] = "doc(1)(1)"
Since names[0] = "doc", names[1] = "doc(1)", and names[4] = "doc", update names[4] = "doc(2)"
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.string names

Guaranteed constraints:
5 ≤ names.length ≤ 1000,
1 ≤ names[i].length ≤ 15.

[output] array.string
 */