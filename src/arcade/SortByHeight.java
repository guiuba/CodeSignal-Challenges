package arcade;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortByHeight {
    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(solution(a)));
    }
   static int[] solution(int[] a) {
        List<Integer> list = Arrays.stream(a).boxed().filter(elem -> elem > -1).sorted().collect(Collectors.toList());
       // [150, 160, 170, 180, 190]
        for (int i = 0; i < a.length; i++) {
            if (a[i] > -1) {
                a[i] = list.remove(0);

            }
        }
       // return  list.toArray(Integer[]::new);
       return a;
    }
}
