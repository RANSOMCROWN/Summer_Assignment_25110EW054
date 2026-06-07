import java.util.Scanner;

public class code3 {

    static int sumOfDigits(int n) {

        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int sum = sumOfDigits(num);

        System.out.println("Sum of digits is: " + sum);

        sc.close();
    }
}
