
import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int roll;
        String name;
        int marks;

        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();

        System.out.println("\n----- Student Record -----");
        System.out.println("Roll Number : " + roll);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);

        sc.close();
    }
}