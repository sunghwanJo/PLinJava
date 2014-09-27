package last.station;

import java.util.Comparator;

import last.customer.Customer;

public abstract class Policy implements Comparator<Customer>{

	@Override
	public abstract int compare(Customer o1, Customer o2);

}