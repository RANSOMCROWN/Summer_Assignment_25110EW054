import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, count = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num > 0) {

            if (num % 2 == 1) {
                count++;
            }

            num = num / 2;
        }

        System.out.println("Number of set bits is: " + count);

        sc.close();
    }
}