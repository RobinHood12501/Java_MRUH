import java.util.Scanner;

class SumOf2Matrix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i, j;

        System.out.println("Enter the row size");
        int rows = obj.nextInt();
        System.out.println("Enter the column size");
        int cols = obj.nextInt();

        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];

        System.out.println("Enter the First Matrix");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                a[i][j] = obj.nextInt();
            }
        }
        System.out.println("Enter the Second Matrix");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                b[i][j] = obj.nextInt();
            }
        }

        int c[][] = new int[rows][cols];
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("The Output is: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                System.out.print(c[i][j]);
                System.out.print(" ");
            }
        }

    }
}
