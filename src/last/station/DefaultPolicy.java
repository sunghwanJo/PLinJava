package last.station;

import last.customer.Customer;

public class DefaultPolicy extends Policy{

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getId() > o2.getId())
			return 1;
		return -1;
	}

}
