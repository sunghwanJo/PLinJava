package last;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

import last.customer.Customer;
import last.customer.CustomerMaker;
import last.station.DefaultPolicy;


public class Main {
	
	public static void main(String[] args) {
		ArrayList<Customer> customerList;
		PriorityQueue<Customer> queue;
		
		// Set up Customer Information
		customerList = CustomerMaker.make();
		
		// Set up Ticketing Booth
		queue = new PriorityQueue<Customer>(customerList.size(), new DefaultPolicy());
		
		System.out.println("Success to make Customer List ["+customerList.size()+"]");
		
		int timer = 0;
		while(!customerList.isEmpty()){
			System.out.println("TIME :" + timer);
			Iterator<Customer> iter = customerList.iterator();
			
			while(iter.hasNext()){
				Customer customer = iter.next();
				if(customer.getArrivedTime() == timer){
					queue.add(customer);
					iter.remove();
				}
			}
			timer++;
		}
		
		System.out.println("END SYSTEM");
	}

}
