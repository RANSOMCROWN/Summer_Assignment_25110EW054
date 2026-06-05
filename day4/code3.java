import java.util.Scanner;

public class code3{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, originalNum, digit, sum = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        originalNum = num;

        while (num != 0) {

            digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number");
        } else {
            System.out.println(originalNum + " is not an Armstrong Number");
        }

        sc.close();
    }
}