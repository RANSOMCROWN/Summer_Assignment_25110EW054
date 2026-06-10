import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            char ch = (char) ('A' + i - 1);

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }

            System.out.println();
        }

        sc.close();
    }
}