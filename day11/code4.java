import java.util.Scanner;

public class code4 {

    static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int result = factorial(num);

        System.out.println("Factorial of " + num + " is: " + result);

        sc.close();
    }
}