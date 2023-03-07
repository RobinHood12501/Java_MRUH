import java.util.Scanner;

class ButterflyPattern {
    public static void main(String[] args) {
        int n, i, j, k, s;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Height: ");

        n = obj.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (s = 2 * (n - i); s > 0; s--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = n - 1; i > 0; i--) {
            for (j = i; j > 0; j--) {
                System.out.print("*");
            }
            for (s = 2 * (n - i); s > 0; s--) {
                System.out.print(" ");
            }
            for (k = i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
