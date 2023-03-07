import java.util.Scanner;

class TrianglePattern {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int n, i, j;
        System.out.println("Enter the height of triangle:");
        n = obj.nextInt();

        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (i = n - 1; i > 0; i--) {
            for (j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
