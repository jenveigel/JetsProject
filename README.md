## Jets Project

### Week 2 Homework for Skill Distillery



Created a fleet of jets at an Aerial Port, defining the following attributes for each:
	Model
	Speed (input in MPH by user / displayed in Mach) 
	Range
	Price
	Pilot Assigned (not yet used)

//NOTE: couldn't figure out how to do printf formating with .append for decimal places on SpeedInMach

Includes the following classes:
	AerialPort
	AerialPortDriver (with the main method)
	Aircraft (abstract)
		F15
		F16
		F35
	Pilot (not yet used)

The user is met with a menu which displays
	1. List fleet
	2. View fastest jet
	3. View jet with longest range
	4. Add a jet to Fleet
	5. Quit

Menu is set up with switch / case where
	case 1. calls up the listAircraft method located in the AerialPort class
	case 2. uses the fastestJet method located in AerialPort class
	case 3. uses the longestRange method located in the AerialPort class
	case 4. uses the addJet method located in AerialPort class
	case 5. is set at the end of the main so it quits program when selected.
	
//Note: case 4 requires user to input String model exactly--no error catching for mistyping.
