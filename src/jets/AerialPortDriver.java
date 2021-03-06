package jets;

import java.util.Scanner;

public class AerialPortDriver {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		AerialPort ap = new AerialPort(); // is this a new state of the AP?

		// displays menu options on initial start up vvvvvvvvvv
		int menuChoice = 1;
		while (menuChoice != 5) {
			do {
				System.out.println("Which would you like to do? \n Please enter a number from 1 to 5. \n"
						+ "   1. List Fleet \n   2. View Fastest Jet \n   3. View Jet with Longest Range"
						+ "\n   4. Add a Jet to the Fleet \n   5. Quit");

				menuChoice = kb.nextInt(); // takes menu choice from user

				if (! (menuChoice >= 1 && menuChoice <= 5)) {
					System.out.println("Error. Please select a number between 1 and 5");
				}

			} while (! (menuChoice >= 1 && menuChoice <= 5)) ;

			if (menuChoice >= 1 && menuChoice <= 5) {

				switch (menuChoice) {
				case 1:
					ap.listAircraft();
					// displays array of aircraft
					break;
				case 2:
					ap.fastestJet();
					// view fastest jet
					break;
				case 3:
					ap.longestRangeJet();
					break;
				case 4:
					System.out.print("Please type in the type of jet you'd like to add (F-15, F-16, or F-35): ");
					String model = kb.next();
					System.out.print("Speed in MPH: ");
					double speed = (kb.nextDouble() / 767); // look at printF information
					System.out.print("Range: ");
					int range = kb.nextInt();
					System.out.print("Price in Millions: $");
					double priceInMil = kb.nextDouble();
					System.out.println("");

					switch (model) {
					case "F-15":
						Aircraft a = new F15(model, speed, range, priceInMil);
						if (ap.addJet(a)) {
							System.out.println(a + " added to Aircraft Fleet.");
							System.out.println("");
						} else {
							System.out.println("Sorry, the Aerial Port is full.");
							System.out.println("");
						}
						break;
					case "F-16":
						Aircraft b = new F16(model, speed, range, priceInMil);
						if (ap.addJet(b)) {
							System.out.println(b + " added to Aircraft Fleet.");
							System.out.println("");
						} else {
							System.out.println("Sorry, the Aerial Port is full.");
							System.out.println("");
						}
						break;
					case "F-35":
						Aircraft c = new F35(model, speed, range, priceInMil);
						if (ap.addJet(c)) {
							System.out.println(c.getModel() + " added to Aircraft Fleet.");
							System.out.println("");
						} else {
							System.out.println("Sorry, the Aerial Port is full.");
							System.out.println("");
						}
						break;

					}
					ap.listAircraft();
					System.out.println("");
					break;
				case 5:
					System.out.println("Good-bye");
					break; // quit
				}
			}
		}
		kb.close(); // close inside very end of main method

	}
}
