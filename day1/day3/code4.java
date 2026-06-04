import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, max, lcm;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        max = (num1 > num2) ? num1 : num2;

        lcm = max;

        while (true) {

            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }

            lcm++;
        }

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close();
    }
}
