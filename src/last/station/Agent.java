package last.station;

import last.Main;
import last.customer.Customer;

public class Agent {
	private boolean isBusy;
	private Platform platform;
	private TicketBooth ticketBooth;

	public Agent(TicketBooth ticketBooth, Platform platform) {
		this.isBusy = false;
		this.platform = platform;
		this.ticketBooth = ticketBooth;
	}

	public boolean processCustomer() {
		if (!isBusy) {
			Customer customer = ticketBooth.getWatingCustomer();
			if(customer == null)
				return isBusy();
			
			setBusy(true);
			Customer ticketingCustomer = customer;
			int startTicketingTime = Main.time;
			int ticketingTime = customer.getTicketingTime();
			int processTime = 0;

			while (Main.time == startTicketingTime + ticketingTime) {
				processTime++;
			}

			System.out.println("[AGENT] Process Custom="
					+ ticketingCustomer.getId());
			ticketingCustomer.setWaitTimeForTicketing(processTime);
			ticketingCustomer.setTimeForTicketing(Main.time);
			platform.addCustomer(ticketingCustomer);
			setBusy(false);
		}
		return isBusy();
	}

	public boolean isBusy() {
		return isBusy;
	}

	private void setBusy(boolean busy) {
		isBusy = busy;
	}
}
