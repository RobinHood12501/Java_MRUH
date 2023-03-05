import java.util.Scanner;

class Fibonacci{
    public static void main(String args[]){
        int n, a=0, b=1, c;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number u want the series to end at");
        n = obj.nextInt();

        c = a + b;
        System.out.println("The Fibonacci Series is:");
        System.out.println(a);
        System.out.println(b);
        while(c<=n){
            System.out.println(c);

            a = b;
            b = c;
            c = a + b;
        }
    }
}