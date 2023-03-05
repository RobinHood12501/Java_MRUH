import java.util.Scanner;

class Palindrome {
    public static void main(String args[]) {
        String s;
        int i, j, n, count = 1;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string:");
        s = obj.nextLine();
        n = s.length();

        for (i = 0, j = n - 1; i < n / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                count = 0;
        }

        if (count == 0)
            System.out.println("The string " + s + " is not a palindrome");
        else
            System.out.println("The string " + s + " is a palindrome");

    }
}
