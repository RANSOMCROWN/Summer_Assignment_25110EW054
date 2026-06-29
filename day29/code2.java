import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 5 Elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {

            System.out.println("\n1.Display");
            System.out.println("2.Sum");
            System.out.println("3.Maximum");
            System.out.println("4.Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    for (int i = 0; i < 5; i++) {
                        System.out.print(arr[i] + " ");
                    }

                    System.out.println();
                    break;

                case 2:

                    int sum = 0;

                    for (int i = 0; i < 5; i++) {
                        sum += arr[i];
                    }

                    System.out.println("Sum = " + sum);
                    break;

                case 3:

                    int max = arr[0];

                    for (int i = 1; i < 5; i++) {

                        if (arr[i] > max)
                            max = arr[i];
                    }

                    System.out.println("Maximum = " + max);
                    break;

            }

        } while (choice != 4);

        sc.close();
    }
}