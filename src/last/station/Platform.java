package last.station;

import java.util.ArrayList;

import last.customer.Customer;

public class Platform {
	private ArrayList<Customer> customerList;
	
	public Platform(){
		customerList = new ArrayList<Customer>();
	}
	
	public void addCustomer(Customer customer){
		customerList.add(customer);
	}
}
