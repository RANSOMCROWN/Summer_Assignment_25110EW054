import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.print("Enter size of first array: ");
        n1 = sc.nextInt();

        int arr1[] = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        n2 = sc.nextInt();

        int arr2[] = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Union:");

        for (int i = 0; i < n1; i++) {
            System.out.print(arr1[i] + " ");
        }

        for (int i = 0; i < n2; i++) {

            boolean found = false;

            for (int j = 0; j < n1; j++) {

                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(arr2[i] + " ");
            }
        }

        sc.close();
    }
}