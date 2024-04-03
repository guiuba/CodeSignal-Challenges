package theCore;

public class Lineup {
    public static void main(String[] args) {
        String commands = "LLARL";
        System.out.println(solution(commands));

    }
    static int solution(String commands) {
        int turn = 0;
        int sameDirection = 0;
        boolean isSamedirection = true;
        for (int i = 0; i < commands.length(); i++) {
            switch (commands.charAt(i)) {
                case 'L' -> {

                    ++turn;
                    isSamedirection = !isSamedirection;
                    if (turn % 2 == 0) {
                        sameDirection++;
                    }
                }
                case 'R' -> {
                    ++turn;
                    isSamedirection = !isSamedirection;
                    if (turn % 2 == 0) {
                        sameDirection++;
                    }
                }
                case 'A' -> {
                    if (isSamedirection) {
                        sameDirection++;
                    }
                }
            }
        }
        return sameDirection;
    }
}
/*
solução colega:
  int t = 0;
    boolean s = true;
    for (char c : commands.toCharArray()) {
        if (c == 'L' || c == 'R')
            s = !s;
        if (s)
            t++;
    }
    return t;
To prepare his students for an upcoming game, the sports coach decides to try some new training drills.
To begin with, he lines them up and starts with the following warm-up exercise: when the coach says 'L',
he instructs the students to turn to the left. Alternatively, when he says 'R', they should turn to the right.
 Finally, when the coach says 'A', the students should turn around.

Unfortunately some students (not all of them, but at least one) can't tell left from right, meaning they
always turn right when they hear 'L' and left when they hear 'R'. The coach wants to know how many times
the students end up facing the same direction.

Given the list of commands the coach has given, count the number of such commands after which the students
will be facing the same direction.

Example

For commands = "LLARL", the output should be
solution(commands) = 3.

Let's say that there are 4 students, and the second one can't tell left from right. In this case, only after
the second, third and fifth commands will the students face the same direction.
 */
