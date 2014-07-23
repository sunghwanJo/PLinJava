package week2.company;


public class Car {
	CarInformation carInformation;
	
	Car(){

	}

	public CarInformation getCarInformation() {
		return carInformation;
	}

	public void initCarInformation(CarInformation carInformation) {
		this.carInformation = carInformation;
		this.carInformation.addCount();
	}
	
}
