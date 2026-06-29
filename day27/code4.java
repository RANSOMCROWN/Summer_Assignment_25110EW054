
import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int m1, m2, m3, m4, m5;
        int total;
        double percentage;

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        m3 = sc.nextInt();

        System.out.print("Enter Marks of Subject 4: ");
        m4 = sc.nextInt();

        System.out.print("Enter Marks of Subject 5: ");
        m5 = sc.nextInt();

        total = m1 + m2 + m3 + m4 + m5;
        percentage = total / 5.0;

        System.out.println("\n------ Marksheet ------");
        System.out.println("Name        : " + name);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade : A");
        } else if (percentage >= 75) {
            System.out.println("Grade : B");
        } else if (percentage >= 60) {
            System.out.println("Grade : C");
        } else if (percentage >= 40) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : Fail");
        }

        sc.close();
    }
}