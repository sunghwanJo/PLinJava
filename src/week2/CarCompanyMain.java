package week2;

import week2.company.CarCompany;
import week2.company.Genesis;
import week2.company.Grandeur;
import week2.company.Sonata;

public class CarCompanyMain {
	public static void main(String[] args) {
		CarCompany carCompany;
		carCompany = CarCompany.getInstance();
		
		carCompany.addCarProduction(Sonata.class.getName());
		carCompany.addCarProduction(Sonata.class.getName());
		carCompany.addCarProduction(Sonata.class.getName());
		
		carCompany.addCarProduction(Grandeur.class.getName());
		carCompany.addCarProduction(Grandeur.class.getName());
		
		carCompany.addCarProduction(Genesis.class.getName());
		
		carCompany.printPriceOfCars();
	}
}
