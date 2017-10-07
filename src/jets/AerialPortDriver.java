package jets;

import java.util.Scanner;

public class AerialPortDriver {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		System.out.println("Model: ");
		String model = kb.next();
		System.out.println("Speed in MPH: "); //****need an MPH to MACH calc somewhere
		double speed = kb.nextDouble();
		System.out.println("Range: ");
		int range = kb.nextInt();
		System.out.println("Price in Millions: $");
		double priceInMil = kb.nextDouble();
		
		switch (model) {
		case "F-15":
		// switch and cases vs
		Aircraft a = new F15(model, speed, range, priceInMil);
		}
		
		
		
		
		
//		this.model = model;
//		this.speedInMach = speedInMach;
//		this.range = range;
//		this.priceInMil = priceInMil;

		// input new aircraft method () {
		//
		// }

		// assign pilot to aircraft method () {
		//
		// }

		AerialPort ap = new AerialPort(); // what does this do?
		ap.listAircraft();

		// display aircraft method () {
		//
		// }

	
		kb.close(); //close inside very end of main method
	}
}
