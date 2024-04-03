package arcade;

public class OutdefineTest {
    public static void main(String[] args) {
        System.out.println(Solve(3));
     //   System.out.println(6 % 2);
    }
    static String Solve(int N){
        // Write your code here
        int sum = 1;
        for(int i = 2; i < N; i++) {
            if(i % N == 0) {
                sum += i;
            }
        }
     //   System.out.println(sum);
        return N == sum ? "YES" : "NO";
    }
}
