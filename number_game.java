
// Java program for the above approach
import java.util.Scanner;

public class number_game {

	// Function that implements the
	// number guessing game
	static int score=0;
	public static void guessNumber1()
	{
		// Scanner Class
		System.out.println("\nLEVEL 1: ");
		// System.out.println("Guess number n 5 trials:");
		// System.out.println("Enter a no between 1 to 50 to guess: ");
		Scanner sc = new Scanner(System.in);
		
		// Generate the numbers
		int number = 1 + (int)(51* Math.random());

		int K = 5;  // Given K trials

		int i, guess;

		System.out.println("A number is chosen between 1 to 50.Guess the number within 5 trials.");

		// Iterate over K Trials
		for (i = 0; i < K; i++) {

			System.out.println(
				"Guess the number:");

			// Take input for guessing
			guess = sc.nextInt();

			// If the number is guessed
			if (number == guess) {
				System.out.println(
					"Congratulations!"
					+ " You guessed the number. You won Level 1!!");
					score++;
					guessNumber2();
				break;
			}
			else if (number > guess
					&& i != K - 1) {
				System.out.println(
					"The number is "
					+ "greater than " + guess);
			}
			else if (number < guess
					&& i != K - 1) {
				System.out.println(
					"The number is"
					+ " less than " + guess);
			}
		}

		if (i == K) {
			System.out.println(
				"You have exhausted your trials.");

			System.out.println(
				"The number was " + number);
		}
		
	}
	public static void guessNumber2()
	{
		// Scanner Class
		System.out.println("\nLEVEL 2: ");
		System.out.println("You entered in second level=>");
		// System.out.println("Enter a no between 1 to 50 to guess: ");
		Scanner sc = new Scanner(System.in);
		int min = 50;  
     	int max = 101; 
		// Generate the numbers
		int number = 1 + (int)(Math.random()*(max-min+1)+min);

		int K = 5;  // Given K trials

		int i, guess;

		System.out.println("A number is chosen between 50 to 100.Guess the number within 5 trials.");

		// Iterate over K Trials
		for (i = 0; i < K; i++) {

			System.out.println(
				"Guess the number: ");

			// Take input for guessing
			guess = sc.nextInt();

			// If the number is guessed
			if (number == guess) {
				System.out.println(
					"Congratulations!"
					+ " You guessed the number.You won Level 2!!");
					score++;
					guessNumber3();
				break;
			}
			else if (number > guess
					&& i != K - 1) {
				System.out.println(
					"The number is "
					+ "greater than " + guess);
			}
			else if (number < guess
					&& i != K - 1) {
				System.out.println(
					"The number is"
					+ " less than " + guess);
			}
		}

		if (i == K) {
			System.out.println(
				"You have exhausted your trials.");

			System.out.println(
				"The number was " + number);
		}
		
	}

	public static void guessNumber3()
	{
		// Scanner Class
		System.out.println("\nLEVEL 3: ");
		System.out.println("You entered in second level=>");
		// System.out.println("Enter a no between 1 to 50 to guess: ");
		Scanner sc = new Scanner(System.in);
		 
		int number = 1 + (int)(100* Math.random());
		int K = 5;  // Given K trials
		 
		int i, guess;

		System.out.println("A number is chosen between 1 to 100.Guess the number within 5 trials.");

		// Iterate over K Trials
		for (i = 0; i < K; i++) {

			System.out.println(
				"Guess the number:");

			// Take input for guessing
			guess = sc.nextInt();

			// If the number is guessed
			if (number == guess) {
				System.out.println(
					"Congratulations!"
					+ " You guessed the number. You won Level 3!!");
					score++;
					guessNumber2();
				break;
			}
			else if (number > guess
					&& i != K - 1) {
				System.out.println(
					"The number is "
					+ "greater than " + guess);
			}
			else if (number < guess
					&& i != K - 1) {
				System.out.println(
					"The number is"
					+ " less than " + guess);
			}
		}

		if (i == K) {
			System.out.println(
				"\nGame Over!!You have exhausted your trials.");

			System.out.println(
				"The number was " + number);
		}
		
	}
	// Driver Code
	public static void main(String arg[])
	{
        // Function Call
		
		System.out.println("\nChoose :\n1:Play the Game\n2:Exit\nEnter your choice:");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		do {
			switch(choice)
			{
				case 1:
					guessNumber1();
					System.out.println("\nYour final score: " + score);
					System.out.println("Thank you for playng Guessing Game!");
					break;
				case 2:
					System.exit(0);
					break;
				default:
					System.out.println("Enter correct choice!!");
					break;
			}
		}while(choice!=2);
		
		
		
	}
}
