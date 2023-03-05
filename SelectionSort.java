import java.net.SocketPermission;
import java.util.Scanner;

class SelectionSort {
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);

        int array[], n, i, j, k, smallest, temp;

        System.out.println("Enter the size of array: ");
        n = obj.nextInt();

        array = new int[n];

        System.out.println("Enter the Elements: ");
        for (i = 0; i < n; i++) {
            array[i] = obj.nextInt();
        }

        for (j = 0; j < n - 1; j++) {
            smallest = j;
            for (k = j + 1; k < n; k++) {
                if (array[k] < array[smallest]) {
                    smallest = k;
                }
            }
            temp = array[j];
            array[j] = array[smallest];
            array[smallest] = temp;
        }

        System.out.println("The Elements are: ");
        for (i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }

}
