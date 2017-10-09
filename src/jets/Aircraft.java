package jets;

public abstract class Aircraft {

	private String model;
	private double speedInMach;  
	private int range;
	private double priceInMil;
	
	
	
	//String pilotAssigned;
	
	// constructor using fields========vvvvvvvvvvvvv
	public Aircraft(String model, double speedInMach, int range, double priceInMil) {
		super();
		this.model = model;
		this.speedInMach = speedInMach;
		this.range = range;
		this.priceInMil = priceInMil;
	}
	
	public Aircraft() { 	// no args constructor
	}
	
	public void assignPilot() {
		
	} 
	

	//getters and setters===============vvvvvvvvvvvvv
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeedInMach() {
		return speedInMach;
	}

	public void setSpeedInMach(double speedInMach) {
		this.speedInMach = speedInMach;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPriceInMil() {
		return priceInMil;
	}

	public void setPriceInMil(double priceInMil) {
		this.priceInMil = priceInMil;
	}
//getters and setters===============^^^^^^^^^^^^

//toString method used to interpret list array of aircraft
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(model);
		builder.append(", Speed: Mach ");
		builder.append(speedInMach); //how do you use printf format "%.1f" here???
		builder.append(", Range: ");
		builder.append(range + " Miles");
		builder.append(", Price: $");
		builder.append(priceInMil + "M");
		return builder.toString();
		
	}
	
}
