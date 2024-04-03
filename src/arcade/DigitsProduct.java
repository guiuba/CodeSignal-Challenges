package arcade;

public class DigitsProduct {
    public static void main(String[] args) {
        int product = 12;
        //   int  product = 19;
        System.out.println(solution(product));
    }

    static int solution(int product) {
        if (product == 0)
            return 10;
        if (product < 10)
            return product;

        String r = "";
        for (int d = 9; d > 1; d--)
            for (; product % d == 0; product /= d)
                r = d + r;
        return product == 1 ? Integer.parseInt(r) : -1;
    }
}

/*
Given an integer product, find the smallest positive
(i.e. greater than 0) integer the product of whose digits
is equal to product. If there is no such integer, return -1 instead.

Example

For product = 12, the output should be
solution(product) = 26;
For product = 19, the output should be
solution(product) = -1.
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] integer product

Guaranteed constraints:
0 ≤ product ≤ 600.

[output] integer
 */

/*
        if (product == 0) return 10;
        else if (product < 10) return product;

        int smallPos = 0;
        while (product > 9) {
            int orig = product;
            for (int f = 9; f > 1; f--) {
                //exec and update product value
                if(product % f == 0) {
                    int nextDigit = product / f;
                    nextDigit = solution(nextDigit);
                    if (nextDigit == -1) return  -1;
                    smallPos = smallPos * 10 + nextDigit;
                    product = f;
                    break;
                }
            }
            if (product == orig) return -1;
        }

        return smallPos * 10 + product;
 */