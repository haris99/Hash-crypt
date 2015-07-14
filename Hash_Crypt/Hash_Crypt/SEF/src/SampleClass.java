import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Student
 *
 */
public class SampleClass {

	public static int sum(int h) {
		int result = 0;
		for (int i = 1; i <= h; i++) {
			result += i * i;
		}
		return result;
	}

	public static void greet(String Name) {
		System.out.println("This is your class " + Name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		// String x = "Haralds";
		// System.out.println ("This is your class " + x);

		
		
		// greet(args[0]);
		// System.out.println ("The result is "+sum(4));
		Scanner in = new Scanner(System.in);
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(100);
		int guessNumber = Integer.parseInt(args[1]);

		String text = "";
		boolean finished = false;
		while (finished == false) {
			if (randomInt < guessNumber) {
				text = "Your guess is too high";
			} else if (randomInt == guessNumber) {
				text = "You guessed right";
				finished = true;
			} else {
				text = "You guessted too low";
			}
			System.out.println(text);
			System.out.println("Random number: " + randomInt + " Inputted number: " + guessNumber);
			if (finished == false) {
				System.out.println("Next guess? ");
				guessNumber = sc.nextInt();
			}
		}

	}

}
