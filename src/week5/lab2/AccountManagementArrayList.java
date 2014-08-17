package week5.lab2;

import java.util.ArrayList;
import java.util.Iterator;

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
		Iterator<Account> iterator = accountList.iterator();
		while(iterator.hasNext()){
			Account account = iterator.next();
			if(account.getSerialNumber().equals(serialNumber))
				return account;
		}
		
		return null;
	}

	public void accountAllDisplay() {
		Iterator<Account> iterator = accountList.iterator();
		while(iterator.hasNext()){
			Account account = iterator.next();
			System.out.println(account.toString());
		}
	}
	
}
