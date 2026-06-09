import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, binary = 0, place = 1, remainder;

        System.out.print("Enter a decimal number: ");
        num = sc.nextInt();

        while (num > 0) {

            remainder = num % 2;
            binary = binary + (remainder * place);

            place = place * 10;
            num = num / 2;
        }

        System.out.println("Binary number is: " + binary);

        sc.close();
    }
}