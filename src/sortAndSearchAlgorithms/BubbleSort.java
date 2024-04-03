package sortAndSearchAlgorithms;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // just change signal to make it descending
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arrayToSort = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array before sorting:");
        printArray(arrayToSort);

        bubbleSort(arrayToSort);

        System.out.println("\nArray after sorting:");
        printArray(arrayToSort);
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
