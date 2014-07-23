package week2.company;

public class Genesis extends Car{
	private static int count;
	private static String carName=Genesis.class.getSimpleName();
	private static int carPrice;
	
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Genesis.count = count;
	}
	public static String getCarName() {
		return carName;
	}
	public static void setCarName(String carName) {
		Genesis.carName = carName;
	}
	public static int getCarPrice() {
		return carPrice;
	}
	public static void setCarPrice(int carPrice) {
		Genesis.carPrice = carPrice;
	}
	
	
	
}
