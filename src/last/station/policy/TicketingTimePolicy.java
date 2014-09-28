package last.station.policy;

import last.customer.Customer;

public class TicketingTimePolicy extends Policy{

	@Override
	public int compare(Customer o1, Customer o2) {
        if(o1.getTicketingTime() > o2.getTicketingTime()) 
        	return 1;
        return -1;
        
	}

}
