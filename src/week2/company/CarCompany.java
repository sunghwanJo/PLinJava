package week2.company;

import java.util.ArrayList;
import java.util.HashMap;

public class CarCompany {
	private CompanyAccountant accountant;
	private static CarCompany carCompany;
	private HashMap<String, CarInformation> carInformationList;
	private ArrayList<Car> carList;

	static public CarCompany getInstance(){
		if(carCompany == null)
			carCompany = new CarCompany();
		
		return carCompany;
	}
	
	CarCompany(){
		accountant = new CompanyAccountant();
		carList = new ArrayList<Car>();
		carInformationList = carListSetUp();
	}


	private HashMap<String, CarInformation> carListSetUp(){
		HashMap<String, CarInformation> tmpCarInformationList = new HashMap<String, CarInformation>();
		tmpCarInformationList.put(Sonata.class.getName(), new CarInformation(Sonata.class.getName(), 3000));
		tmpCarInformationList.put(Grandeur.class.getName(), new CarInformation(Grandeur.class.getName(), 4000));
		tmpCarInformationList.put(Genesis.class.getName(), new CarInformation(Genesis.class.getName(), 5000));
		
		return tmpCarInformationList;
	}
	
	public void addCarProduction(String carName){
		try {
			Class<?> carClass = Class.forName(carName);
			Car car = (Car) carClass.newInstance();
			
			CarInformation carInformation = carInformationList.get(carName);
			car.initCarInformation(carInformation);
			
			carList.add(car);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printPriceOfCars(){
		System.out.println("Sum : "+accountant.calculateAllPriceOfCars(carInformationList.values()));
	}
	
}
