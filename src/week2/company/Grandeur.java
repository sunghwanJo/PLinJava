package week2.company;

public class Grandeur extends Car{
	private static int count;
	private static String carName=Grandeur.class.getSimpleName();
	private static int carPrice;
	
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Grandeur.count = count;
	}
	public static String getCarName() {
		return carName;
	}
	public static void setCarName(String carName) {
		Grandeur.carName = carName;
	}
	public static int getCarPrice() {
		return carPrice;
	}
	public static void setCarPrice(int carPrice) {
		Grandeur.carPrice = carPrice;
	}
	
	
	
}
