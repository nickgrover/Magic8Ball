import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 */
public class Magic8Ball {

    // 1. Make a main method that includes all the steps below

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean runBall = true;
        while (runBall) {
            System.out.println("Enter a question for the magic 8-ball to answer (Enter 'stop' to end)!: ");
            String userQuestion = scanner.nextLine();
            if (userQuestion.equalsIgnoreCase("stop")) {
                System.out.println("Thank you for playing! I hope you got what you were looking for.");
                break;
            }

            int randomNumber = new Random().nextInt(9);

            if (randomNumber == 0) {
                System.out.println("Yes");
            }
            if (randomNumber == 1) {
                System.out.println("No");
            }
            if (randomNumber == 2) {
                System.out.println("Maybe if you are lucky!");
            }
            if (randomNumber == 3) {
                System.out.println("It's a lock my friend");
            }
            if (randomNumber == 4) {
                System.out.println("There was never a chance");
            }
            if (randomNumber == 5) {
                System.out.println("Unfortunately, I don't think so");
            }
            if (randomNumber == 6) {
                System.out.println("I have a really good feeling for you...");
            }
            if (randomNumber == 7) {
                System.out.println("Oh my god. No way...");
            }
            if (randomNumber == 8) {
                System.out.println("Hmmmm please ask me again");
            }
            System.out.println();
        }


    }


    // 2. Get the user to enter a question for the magic 8-ball to answer
    //    Scanner scanner = new Scanner(System.in);
    //    String userQuestion = scanner.nextLine();


    // 3. Make a variable and initialize it to a random number.
    //
    //    // Get random a number from: [0, 1, 2, 3]
    //    int randNumber = new Random().nextInt(4);


    // 4. If the random number is 0

        // Tell the user "Yes"


    // 5. If the random number is 1

        // Tell the user "No"


    // 6. If the random number is 2

        // Tell the user a custom response


    // 7. If the random number is 3

        // Tell the user a custom response
}


