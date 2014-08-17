package week5.arraylist;

import java.util.ArrayList;

public class AccountManagementArrayList{
	ArrayList<Account> accountList; 
	
	public AccountManagementArrayList(){
		accountList = new ArrayList<Account>(10); 
	}
	
	public AccountManagementArrayList(int i) {
		accountList = new ArrayList<Account>(i);
	}

	public void insertAccount(int deposit, String serialNumber, String name) {
		Account account = new Account(deposit, serialNumber, name);
		accountList.add(account);
	}

	public void setDeposit(int deposit, String serialNumber) {
		Account account = search(serialNumber);
		
		account.setDeposit(account.getDeposit() + deposit);
	}
	
	private Account search(String serialNumber){
		for(Account account : accountList){
			if(account.getSerialNumber().equals(serialNumber))
				return account;
		}
		
		return null;
	}

	public void accountAllDisplay() {
		for(Account account : accountList){
			System.out.println(account.toString());
		}
		
	}
	
}
