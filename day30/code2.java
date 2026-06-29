import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String books[] = new String[3];

        System.out.println("Enter 3 Book Names:");

        for (int i = 0; i < 3; i++) {
            books[i] = sc.nextLine();
        }

        System.out.println("\nLibrary Books:");

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }

        sc.close();
    }
}