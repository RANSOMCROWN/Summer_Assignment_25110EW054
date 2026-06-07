import java.util.Scanner;

public class code4 {

    static int reverse = 0;

    static void reverseNumber(int n) {

        if (n == 0) {
            return;
        }

        int digit = n % 10;
        reverse = reverse * 10 + digit;

        reverseNumber(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        reverseNumber(num);

        System.out.println("Reversed number is: " + reverse);

        sc.close();
    }
}