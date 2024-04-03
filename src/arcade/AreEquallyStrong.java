package arcade;

import java.util.*;

public class AreEquallyStrong {
    public static void main(String[] args) {
        int yourLeft = 10, yourRight = 15, friendsLeft = 15, friendsRight = 10;
        System.out.println(solution(yourLeft, yourRight, friendsLeft, friendsRight));

    }

    static boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        Set<Integer> set = new HashSet<>(List.of(yourLeft, yourRight, friendsLeft, friendsRight));
        if (yourLeft == yourRight && friendsLeft == friendsRight && yourRight != friendsRight) {
            return false;
        } else return set.size() == 2 || set.size() == 1;
    }
}
/*
return yourLeft==friendsLeft && yourRight==friendsRight || yourLeft==friendsRight && yourRight== friendsLeft;
 */

/*
Call two arms equally strong if the heaviest weights they each are able to lift are equal.

Call two people equally strong if their strongest arms are equally strong (the strongest arm can be both the right and the left),
and so are their weakest arms.

Given your and your friend's arms' lifting capabilities find out if you two are equally strong.

Example

For yourLeft = 10, yourRight = 15, friendsLeft = 15, and friendsRight = 10, the output should be
solution(yourLeft, yourRight, friendsLeft, friendsRight) = true;
For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 10, the output should be
solution(yourLeft, yourRight, friendsLeft, friendsRight) = true;
For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 9, the output should be
solution(yourLeft, yourRight, friendsLeft, friendsRight) = false.
 */