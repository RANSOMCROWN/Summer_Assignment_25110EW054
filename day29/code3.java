import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int choice;

        do {

            System.out.println("\n1.Length");
            System.out.println("2.Uppercase");
            System.out.println("3.Reverse");
            System.out.println("4.Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Length = " + str.length());
                    break;

                case 2:

                    System.out.println(str.toUpperCase());
                    break;

                case 3:

                    String rev = "";

                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev = rev + str.charAt(i);
                    }

                    System.out.println(rev);
                    break;

            }

        } while (choice != 4);

        sc.close();
    }
}