package arcade;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {

        //    int[] sequence = {0, -2, 5, 6};
        //  int[] sequence = {1, 2, 1, 2};
        //      int[] sequence = {3, 6, 5, 8, 10, 20, 15};
        //     int[] sequence = {123, -17, -5, 1, 2, 3, 12, 43, 45};
        //   int[] sequence = {1, 2, 3, 4, 99, 5, 6};
        //   int[] sequence = {10, 1, 2, 3, 4, 5, 6, 1};
        //   int[] sequence = {1, 2, 5, 5, 5};
        //      int[] sequence = {1, 2, 5, 5, 5};
        int[] sequence = {1, 3, 1, 3};
        System.out.println(solution(sequence));
    }

    static boolean solution(int[] sequence) {
        int numErr = 0;
        for (int i = 0; i < sequence.length - 1; i++) { //Condições gerais:
            if (sequence[i] >= sequence[i + 1]) {  //se um elemento for igual ou menor que o anterior
                numErr += 1;
                //condições especiais
                if (i > 0 && //se i for igual ou maior que 1
                        i + 2 <= sequence.length - 1 && // seválido até o anti penultimo indice
                        sequence[i] >= sequence[i + 2] && //se o elemento menos elemento + 2 for maior ou igual a 0
                        sequence[i - 1] >= sequence[i + 1]) { // se o elemento anterior menos o elemento posterior for igual ou maior que zero
                    return false;                             // se o elemento anterior for maior ou igual ao elemento posterior
                }
            }
        }

        return numErr <= 1;
    }
}

/*
Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing
sequence by
removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence
containing
only one element is also considered to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
solution(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
solution(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove
2 to get the strictly increasing sequence [1, 3].

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.integer sequence

Guaranteed constraints:
2 ≤ sequence.length ≤ 105,
-105 ≤ sequence[i] ≤ 105.

[output] boolean

Return true if it is possible to remove one element from the array in order to get a strictly increasing
sequence, otherwise return false.
 */