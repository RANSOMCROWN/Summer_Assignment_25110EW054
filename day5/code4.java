import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, largestPrime = 1;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for (int i = 2; i <= num; i++) {

            if (num % i == 0) {

                int count = 0;

                for (int j = 1; j <= i; j++) {

                    if (i % j == 0) {
                        count++;
                    }
                }

                if (count == 2) {
                    largestPrime = i;
                }
            }
        }

        System.out.println("Largest Prime Factor is: " + largestPrime);

        sc.close();
    }
}