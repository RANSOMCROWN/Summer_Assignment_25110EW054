import java.util.Scanner;

public class code3 {
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

        System.out.println("Intersection Elements:");

        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < n2; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }

        sc.close();
    }
}