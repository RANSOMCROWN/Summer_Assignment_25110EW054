import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        String email;
        long phone;

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Email: ");
        email = sc.nextLine();

        System.out.println("\n------ Contact Details ------");
        System.out.println("Name  : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("Email : " + email);

        sc.close();
    }
}