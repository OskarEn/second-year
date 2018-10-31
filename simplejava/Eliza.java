import com.sun.security.auth.SolarisNumericUserPrincipal;

import java.util.Scanner; // B

public class Eliza {

	public static void main(String[] args) { // C

		Scanner scanner = new Scanner(System.in); // D
		
		String[] lines = { "Why do you feel that way?", // E
				"Have you felt this way for long?",
				"Have you always felt like this?",
				"Do you think that other people feel like this too?",
				"This is a common problem",
				"Please continue"
				 };
		
		System.out.println("Hello!"); // F

		//Setting a limit to the chat
		System.out.println("How long do you want to chat? short/a bit/long");
		String response = scanner.nextLine();
		int duration = 0;

		switch (response) {
			case "short":	duration = 5;
							break;

			case "a bit":	duration = 10;
							break;

			case "long":	duration = 15;
							break;
		}
		
		int i = duration; // G
		while(i < 10){ // H
			
			int randomInt = (int)(Math.random() * lines.length); // J
			System.out.println(lines[randomInt]); // K
			scanner.nextLine();
			i = i + 1; // L
		}
		System.out.println("That will be �100. Goodbye"); // M
	}
}