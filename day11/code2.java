import java.util.Scanner;

public class code2 {

    static int maximum(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        int max = maximum(num1, num2);

        System.out.println("Maximum number is: " + max);

        sc.close();
    }
}