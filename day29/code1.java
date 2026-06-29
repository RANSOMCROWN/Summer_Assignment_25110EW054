import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int a, b;

        do {

            System.out.println("\n----- Calculator -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter First Number: ");
                a = sc.nextInt();

                System.out.print("Enter Second Number: ");
                b = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Answer = " + (a + b));
                        break;

                    case 2:
                        System.out.println("Answer = " + (a - b));
                        break;

                    case 3:
                        System.out.println("Answer = " + (a * b));
                        break;

                    case 4:
                        if (b != 0)
                            System.out.println("Answer = " + (a / b));
                        else
                            System.out.println("Cannot Divide by Zero");
                        break;
                }
            }

        } while (choice != 5);

        System.out.println("Thank You");

        sc.close();
    }
}