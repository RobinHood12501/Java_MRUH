import java.util.Scanner;

class HarshadNumber {
    public static void main(String[] args) {
        int n = 0, i, num, number;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        num = obj.nextInt();
        number = num;
        while (num != 0) {
            i = num % 10;
            n += i;
            num = num / 10;
        }
        if (number % n == 0) {
            System.out.println("The Number " + number + " is Harshad Number!!");
        } else {
            System.out.println("The Number " + number + " is not Harshad Number!!");
        }
    }
}
