import java.util.Scanner;

class Calculations {
    public static void main(String[] args) {
        int a, b, n, c = 0;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first element: ");
        a = obj.nextInt();
        System.out.println("Enter second element: ");
        b = obj.nextInt();

        System.out.println("************MENU*************");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("Enter your operation: ");
        n = obj.nextInt();

        switch (n) {
            case 1:
                c = a + b;
                break;
            case 2:
                c = a - b;
                break;
            case 3:
                c = a * b;
                break;
            case 4:
                c = a / b;
                break;
            case 5:
                c = a % b;
                break;

            default:
                System.out.println("Invalid Input!!!!");
        }
        System.out.println("The output is " + c);
    }
}
