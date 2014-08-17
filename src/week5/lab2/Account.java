package week5.lab2;

public class Account {
	int deposit;
	String serialNumber;
	String name;
	
	public Account(int deposit, String serialNumber, String name) {
		super();
		this.deposit = deposit;
		this.serialNumber = serialNumber;
		this.name = name;
	}

	
	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		
		return this.getName() + "님의 계좌번호는 "+ this.getSerialNumber() + "이며," +"현재 잔고는 " + this.getDeposit() + "입니다.";
	}
	
	
	
}


