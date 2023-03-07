import java.util.Scanner;

class DiamondPattern {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int n, i, j, k;
        System.out.println("Enter the height of diamond:");
        n = obj.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = (n - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = n - 1; i > 0; i--) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (k = (2 * i) - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
