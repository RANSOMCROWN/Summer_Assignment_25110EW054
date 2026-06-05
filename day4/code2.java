import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, first = 0, second = 1, next = 0;

        System.out.print("Enter the value of n: ");
        n = sc.nextInt();

        if (n == 1) {
            System.out.println("Nth Fibonacci term is: " + first);
        } 
        else if (n == 2) {
            System.out.println("Nth Fibonacci term is: " + second);
        } 
        else {

            for (int i = 3; i <= n; i++) {
                next = first + second;
                first = second;
                second = next;
            }

            System.out.println("Nth Fibonacci term is: " + next);
        }

        sc.close();
    }
}