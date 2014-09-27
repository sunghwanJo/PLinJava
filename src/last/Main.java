package last;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

import last.customer.Customer;
import last.customer.CustomerMaker;
import last.station.DefaultPolicy;
import last.station.TicketBooth;


public class Main {
	public static int time=0;
	public static void main(String[] args) {
		ArrayList<Customer> customerList;
		TicketBooth ticketBooth;
		// Set up Customer Information
		customerList = CustomerMaker.make();
		
		// Set up Ticketing Booth
		ticketBooth = new TicketBooth();
		
		System.out.println("Success to make Customer List ["+customerList.size()+"]");
		
		// 고객 도착 반복문.
		while(!customerList.isEmpty() && ticketBooth.isOpen()){
			System.out.println("TIME :" + time);
			Iterator<Customer> iter = customerList.iterator();
			
			while(iter.hasNext()){
				Customer customer = iter.next();
				if(customer.getArrivedTime() == time){
					ticketBooth.addCustomer(customer);
					iter.remove();
				}
			}
			ticketBooth.ticketing();
		
			time++;
		}
		System.out.println("END SYSTEM");
		//고객 처리 반복 쓰레드가 종료되면 끝
		
		
	}

}
