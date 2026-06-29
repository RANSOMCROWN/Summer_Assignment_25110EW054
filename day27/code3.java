
import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double basic, hra, da, gross;

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();

        hra = basic * 0.20;
        da = basic * 0.10;

        gross = basic + hra + da;

        System.out.println("\nBasic Salary : " + basic);
        System.out.println("HRA          : " + hra);
        System.out.println("DA           : " + da);
        System.out.println("Gross Salary : " + gross);

        sc.close();
    }
}