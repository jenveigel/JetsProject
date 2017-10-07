package jets;

public class AerialPort {

		private Aircraft[] jets; //declare an array called jets (aka aircraft)
		
		public AerialPort() { //initialize array of jets
			jets = new Aircraft[15];
			jets[0] = new F16 ("F-16C", 2, 2000, 14.2);
			jets[1]	= new F16 ("F-16C", 2, 2000, 14.4);
			jets[2]	= new F15 ("F-15E", 2.5, 2400, 31);
			jets[3]	= new F16 ("F-16D", 2, 1900, 15.8);
			jets[4]	= new F35 ("F-35A", 1.6, 1350, 95);
		}
		
		public void listAircraft() {
			System.out.println("* * * * * Jets in Aerial Port * * * * *");
			for (Aircraft jet : jets) { // same as iterate over array w/ simple syntax
				if (jet != null ) {
					System.out.println((jet));
				}
			}
				
				
			System.out.println("* * * * * * * * * * * * * * * * * * * *");
		}
		
		public boolean addJet(Aircraft a) { // use this after allow input at AP Driver
			
			
			return true;
			
		}

		
				
	}


//private String model;
//private int speedInMach;  
//private int range;
//private int priceInMil;
//
//String pilotAssigned;