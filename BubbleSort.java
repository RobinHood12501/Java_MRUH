import java.util.Scanner;

class BubbleSort {
    public static void main(String args[]) {
        int array[], n, i, j, k, temp;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = obj.nextInt();

        array = new int[n];
        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            array[i] = obj.nextInt();
        }
        for (j = 0; j < n - 1; j++) {
            for (k = j + 1; k < n; k++) {
                if (array[j] > array[k]) {
                    temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
