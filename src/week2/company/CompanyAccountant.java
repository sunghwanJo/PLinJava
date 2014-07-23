package week2.company;

import java.util.Collection;


public class CompanyAccountant {

	int calculatePriceOfCars(CarInformation carInformation){
		int sumOfprice = carInformation.getCount() * carInformation.getCarPrice(); 
		return sumOfprice;
	}
	
	int calculateAllPriceOfCars(Collection<CarInformation> collection){
		int sumOfPrice = 0;
		for(CarInformation carInfo : collection){
			sumOfPrice += calculatePriceOfCars(carInfo);
		}
		return sumOfPrice;
	}
}
