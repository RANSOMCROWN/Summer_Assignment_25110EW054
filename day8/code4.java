import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, n;
        int result = 1;

        System.out.print("Enter the value of x: ");
        x = sc.nextInt();

        System.out.print("Enter the value of n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        System.out.println("Answer is: " + result);

        sc.close();
    }
}
