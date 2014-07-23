package week2.company;

public class CarInformation {
	private int count;
	private String carName;
	private int carPrice;
	
	public CarInformation() {
		this.setCount(0);
		this.setCarName("");
		this.setCarPrice(0);
	}

	
	public CarInformation(String carName, int price){
		this();
		this.setCarPrice(price);
		this.setCarName(carName);
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	public void addCount(){
		count++;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	
}
