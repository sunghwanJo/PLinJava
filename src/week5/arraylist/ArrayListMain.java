package week5.arraylist;

public class ArrayListMain {

	public static void main(String[] args) {
		AccountManagementArrayList accountManagement = new AccountManagementArrayList(
				10);

		accountManagement.insertAccount(15000, "12345_1", "Tomas");
		accountManagement.insertAccount(25000, "12345_2", "James");
		accountManagement.insertAccount(35000, "12345_3", "Edward");
		accountManagement.insertAccount(45000, "12345_4", "Phoby");
		accountManagement.insertAccount(55000, "12345_5", "Jenny");

		accountManagement.setDeposit(50000, "12345_1");
		accountManagement.setDeposit(50000, "12345_2");
		accountManagement.setDeposit(50000, "12345_3");
		accountManagement.setDeposit(50000, "12345_4");
		accountManagement.setDeposit(50000, "12345_5");

		accountManagement.accountAllDisplay();

	}

}
