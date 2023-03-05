import java.util.Scanner;

class LinearSearch {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int array[], n, i, key, count = 0;

        System.out.println("Enter the size of the arrray: ");
        n = obj.nextInt();

        array = new int[n];

        System.out.println("Enter the Elements: ");
        for (i = 0; i < n; i++) {
            array[i] = obj.nextInt();
        }

        System.out.println("Enter the Element to be Searched: ");
        key = obj.nextInt();
        for (i = 0; i < n; i++) {
            if (key == array[i]) {
                count = 1;
                break;
            }
        }

        if (count == 1) {
            System.out.println("The Number " + key + " is found at " + (i + 1) + "th" + " position");
        } else {
            System.out.println("The Number was not found");
        }
    }
}
