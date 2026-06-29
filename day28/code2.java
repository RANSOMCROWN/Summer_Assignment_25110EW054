import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int accountNo;
        double balance;

        System.out.print("Enter Account Number: ");
        accountNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        name = sc.nextLine();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();

        System.out.println("\n------ Bank Account ------");
        System.out.println("Account Number : " + accountNo);
        System.out.println("Name           : " + name);
        System.out.println("Balance        : " + balance);

        sc.close();
    }
}