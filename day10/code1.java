import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print characters
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
