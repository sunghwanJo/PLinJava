package last;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

import last.customer.Customer;
import last.customer.CustomerMaker;
import last.customer.Writer;
import last.station.platform.Platform;
import last.station.policy.DefaultPolicy;
import last.station.ticket.TicketBooth;


public class Main {
	public static int time=0;
	public static PriorityQueue<Customer> resultQueue = new PriorityQueue<Customer>(100, new DefaultPolicy());
	public static void main(String[] args) {
		ArrayList<Customer> customerList;
		TicketBooth ticketBooth;
		
		// Set up Customer Information
		customerList = CustomerMaker.make();
		
		// Set up Ticketing Booth
		ticketBooth = new TicketBooth();
		int size = customerList.size();
		System.out.println("Success to make Customer List ["+size+"]");
		
		while(resultQueue.size() != size){
			Iterator<Customer> iter = customerList.iterator();
			while(iter.hasNext()){
				Customer customer = iter.next();
				if(customer.getArrivedTime() == time){
					ticketBooth.addCustomer(customer);
					iter.remove();
				}
			}
			
			ticketBooth.ticketing();
			Platform.getInstance().boardTrain();
			
			time++;
		}
		System.out.println("END SYSTEM="+resultQueue.size());
		new Writer().writeCustomer(resultQueue);
		System.out.println("END SYSTEM="+resultQueue.size());
	}

}
