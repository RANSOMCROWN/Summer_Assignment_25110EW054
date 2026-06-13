import java.util.Scanner;

public class code3 {

    static int fibonacci(int n) {

        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        int first = 0;
        int second = 1;
        int next = 0;

        for (int i = 3; i <= n; i++) {

            next = first + second;
            first = second;
            second = next;
        }

        return next;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter the position: ");
        n = sc.nextInt();

        int result = fibonacci(n);

        System.out.println("Fibonacci term is: " + result);

        sc.close();
    }
}