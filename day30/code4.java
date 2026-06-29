import java.util.Scanner;

public class code4 {

    static void display(String name[], int marks[]) {

        System.out.println("\nStudent Details");

        for (int i = 0; i < name.length; i++) {

            System.out.println("Name  : " + name[i]);
            System.out.println("Marks : " + marks[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String name[] = new String[n];
        int marks[] = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();

            sc.nextLine();
        }

        display(name, marks);

        sc.close();
    }
}