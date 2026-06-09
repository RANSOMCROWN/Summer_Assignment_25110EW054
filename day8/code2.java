import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int binary, decimal = 0, base = 1, remainder;

        System.out.print("Enter a binary number: ");
        binary = sc.nextInt();

        while (binary > 0) {

            remainder = binary % 10;
            decimal = decimal + (remainder * base);

            base = base * 2;
            binary = binary / 10;
        }

        System.out.println("Decimal number is: " + decimal);

        sc.close();
    }
}