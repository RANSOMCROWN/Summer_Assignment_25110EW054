import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start, end;

        System.out.print("Enter starting number: ");
        start = sc.nextInt();

        System.out.print("Enter ending number: ");
        end = sc.nextInt();

        System.out.println("Prime numbers are:");

        for (int num = start; num <= end; num++) {

            int count = 0;

            for (int i = 1; i <= num; i++) {

                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}