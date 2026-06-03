import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, originalNum, reverse = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        originalNum = num;

        while (num != 0) {

            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (originalNum == reverse) {
            System.out.println(originalNum + " is a Palindrome number");
        } else {
            System.out.println(originalNum + " is not a Palindrome number");
        }

        sc.close();
    }
}
