package arcade;

public class InterestingPolygon {
    public static void main(String[] args) {
        System.out.println(solution(1));
    }

    static int solution(int n) {
      return (int) (Math.pow(n, 2) + Math.pow(n - 1, 2));
    }
}
