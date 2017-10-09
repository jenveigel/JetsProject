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
			boolean added = false; //declare and initialize variable "added"
			for (int i = 0; i < jets.length; i++) { //iterate over jets array
				if (jets[i] == null) { //if iteration finds null place on array,...
					jets[i] = a;		//Aircraft a (value from above) gets placed in that null space
					added = true;	//then declare that "added" is true
					break;			//this serves to ensure the for loop only runs one time 
				}					//vice filling Aircraft a into all remaining null array slots 
			}
			return added;	
		}

		public Aircraft fastestJet() {
			Aircraft fastest = jets[0];
			for (int i = 0; i < jets.length; i++) {
				if (jets[i] != null) {
					if (jets[i].getSpeedInMach() > fastest.getSpeedInMach()) {
						fastest = jets[i];
					}
				}
				
			}System.out.println(fastest);
			return fastest;
		}
		
		public Aircraft longestRangeJet() {
			Aircraft longestRange = jets[0];
			for (int i = 0; i < jets.length; i++) {
				if (jets[i] != null) {
					if (jets[i].getRange() > longestRange.getRange()) {
						longestRange = jets[i];
					}
				}
				
			}System.out.println(longestRange);
			return longestRange;
		}
		
//		public double fastJet() {
//			double fastest = jets[0].getSpeedInMach(); //sets variable fastest to jet speed in first array slot
//			for (int i = 0; i < jets.length; i++) { //iterate over array
//				if (jets[i] != null) {  //says if array slot is not null
//					if (jets[i].getSpeedInMach() > fastest) {
//						fastest = jets[i].getSpeedInMach();
//					}
//				}
//			}System.out.println(fastest);
//			return fastest;
//		}
	
		public void displaySpeed() {
			System.out.println(jets[4].getSpeedInMach()); 
			
		}
		
	}


//private String model;
//private int speedInMach;  
//private int range;
//private int priceInMil;
//
//String pilotAssigned;