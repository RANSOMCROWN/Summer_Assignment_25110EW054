import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, count = 0;

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element: ");
        int key = sc.nextInt();

        for (int i = 0; i < n; i++) {

            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println("Frequency = " + count);

        sc.close();
    }
}