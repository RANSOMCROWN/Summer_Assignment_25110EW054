import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}