import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int tickets;
        int price = 200;

        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        tickets = sc.nextInt();

        int total = tickets * price;

        System.out.println("\n------ Ticket Details ------");
        System.out.println("Customer Name : " + name);
        System.out.println("Tickets       : " + tickets);
        System.out.println("Total Amount  : " + total);

        sc.close();
    }
}