import java.util.Scanner;

class BinarySearch {
    public static void main(String args[]) {
        int n, first, middle, last, array[], search, i;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = obj.nextInt();
        first = 0;
        last = n - 1;

        array = new int[n];
        System.out.println("Enter the numbers in ascending order:");
        for (i = 0; i < n; i++) {
            array[i] = obj.nextInt();
        }

        System.out.println("Enter the number to be searched:");
        search = obj.nextInt();
        while (first <= last) {
            middle = (first + last) / 2;

            if (search == array[middle]) {
                System.out.println("The number " + search + " is found at " + (middle + 1) + "th" + " position");
                break;
            } else if (search > array[middle]) {
                first = middle + 1;
            } else if (search < array[middle]) {
                last = middle - 1;
            }
        }
        if (first > last) {
            System.out.println("Number Not Found!!");
        }
    }
}