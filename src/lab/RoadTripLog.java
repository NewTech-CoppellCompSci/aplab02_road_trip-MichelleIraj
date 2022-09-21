package lab;

public class RoadTripLog {

	//instance variables
	private double distance; 
	private double fuel;
	private double MPG; 
	
	//constructor
	public RoadTripLog(String Trip) {
		
		//initializing the instance variables 
		this.distance = 0.0; 
		this.fuel = 0.0; 
		this.MPG = 0.0; 
	}

	//adds the distances at each stop
	public void addDistance(double newDistance) {
		
		this.distance += newDistance; 
		
	}
	
	//adds the fuel at each stop 
	public void addFuel(double newFuel) {
		
		this.fuel += newFuel; 

	}

	///collects the info on the total distance
	public Double getTotalDistance() {
		return distance;
	}

	//collects the total fuel
	public Double getTotalFuel() {
		return fuel;
	}

	//collects info and calculates the mpg 
	public Double getMPG() {
		
		MPG = distance/fuel;
		
		return MPG;
	}
	
}
