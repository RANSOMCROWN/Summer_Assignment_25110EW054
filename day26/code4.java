import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int answer;

        System.out.println("Question 1");
        System.out.println("Capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");

        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        System.out.println();

        System.out.println("Question 2");
        System.out.println("2 + 5 = ?");
        System.out.println("1. 6");
        System.out.println("2. 7");
        System.out.println("3. 8");
        System.out.println("4. 9");

        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        System.out.println();

        System.out.println("Question 3");
        System.out.println("Java is a?");
        System.out.println("1. Programming Language");
        System.out.println("2. Browser");
        System.out.println("3. Operating System");
        System.out.println("4. Database");

        answer = sc.nextInt();

        if (answer == 1) {
            score++;
        }

        System.out.println();

        System.out.println("Your Score = " + score + "/3");

        sc.close();
    }
}