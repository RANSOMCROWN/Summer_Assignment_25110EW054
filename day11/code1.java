import java.util.Scanner;

public class code1 {

    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        int result = sum(num1, num2);

        System.out.println("Sum = " + result);

        sc.close();
    }
}