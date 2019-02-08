import java.util.Scanner;

/*
 * Using a while loop and an if statement and a scanner,
 * create a "game" that prompts the user for the answer to 3 questions
 * after the user answers all three questions, tell the user his/her score
 * keep the game going until the user gets 100%
 */

public class Week2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean isLoggedIn = false;
		
		while (!isLoggedIn) {
			System.out.print("What is your name? ");
			String name = scanner.nextLine();
			
			System.out.print("What is your password?" );
			String password = scanner.nextLine();
			
			if (name.equals("Santa")  && password.equals("hohoho")) {
				System.out.println("Welcome back, Santa!!!");
				isLoggedIn = true;
			} else {
				System.out.println("Access denied.");
			}
		}
	}
	
}
