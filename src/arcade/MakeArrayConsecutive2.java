package arcade;

import java.util.Arrays;

public class MakeArrayConsecutive2 {
    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        System.out.println(solution(statues));
    }

    static  int solution(int[] statues) {
        Arrays.sort(statues);
        return statues[statues.length - 1] - statues[0] - statues.length + 1;
  /*      List<Integer> aux = new ArrayList<>();//Arrays.asList(statues);
        for(int i : statues) {
            aux.add(i);
        }
        Collections.sort(aux);
        return (aux.get(aux.size() - 1) - aux.get(0)) - aux.size() + 1;
        */


    }
}
