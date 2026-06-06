import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, originalNum, sum = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        originalNum = num;

        while (num != 0) {

            int digit = num % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            num = num / 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is a Strong Number");
        } else {
            System.out.println(originalNum + " is not a Strong Number");
        }

        sc.close();
    }
}
