package last.station;

import java.util.PriorityQueue;

import last.customer.Customer;

public class TicketBooth {
	private static final int AGENT_NUM=3;
	private PriorityQueue<Customer> customerWatingQueue;
	private boolean isOpen;
	private Agent[] agents;
	private Platform platform;
	
	public TicketBooth() {
		customerWatingQueue = new PriorityQueue<Customer>(100, new DefaultPolicy());
		isOpen = true;
		platform = new Platform();
		agents = new Agent[3];
		agents[0] = new Agent(this, platform);
		agents[1] = new Agent(this, platform);
		agents[2] = new Agent(this, platform);
	}
	
	public void addCustomer(Customer customer){
		if(customerWatingQueue != null)
			customerWatingQueue.add(customer);
	}
	
	public void ticketing(){
		for(int i=0; i<AGENT_NUM; i++){
			agents[i].processCustomer();
		}
	}
	
	public Customer getWatingCustomer(){
		if(customerWatingQueue != null &&!customerWatingQueue.isEmpty() && customerWatingQueue.peek() != null)
			return customerWatingQueue.poll();
		return null;
	}
	
	
	public boolean isOpen() {
		return isOpen;
	}
}
