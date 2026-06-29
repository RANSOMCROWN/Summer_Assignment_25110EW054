
import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String item;
        int quantity;
        double price;

        System.out.print("Enter Item Name: ");
        item = sc.nextLine();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter Price per Item: ");
        price = sc.nextDouble();

        double total = quantity * price;

        System.out.println("\n----- Inventory -----");
        System.out.println("Item Name : " + item);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Price     : " + price);
        System.out.println("Total     : " + total);

        sc.close();
    }
}