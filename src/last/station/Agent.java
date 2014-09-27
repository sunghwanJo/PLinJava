package last.station;

import last.Main;
import last.customer.Customer;

public class Agent {
	private boolean isBusy;
	private Platform platform;
	private TicketBooth ticketBooth;
	private Customer processCustomer = null;
	private int processTime;
	private int startTicketingTime;
	private int ticketingTime;

	public Agent(TicketBooth ticketBooth, Platform platform) {
		this.isBusy = false;
		this.platform = platform;
		this.ticketBooth = ticketBooth;
	}

	public boolean processCustomer() {

		if (isBusy()) {
			processTime++;

			if (Main.time == startTicketingTime + ticketingTime) {
				processCustomer.setWaitTimeForTicketing(processTime);
				processCustomer.setTimeForTicketing(Main.time);
				System.out.println("[AGENT] Process Custom="
						+ processCustomer.toString());
				System.out.println("TICKETING TIME=" + ticketingTime);
				platform.addCustomer(processCustomer);
				callCustomer();
			}

			return isBusy();
		} else {
			callCustomer();
		}

		// if (processCustomer != null && !isBusy()) {
		// int processTime = 0;
		// int startTicketingTime = Main.time;
		// }
		//
		// int ticketingTime = processCustomer.getTicketingTime();

		// if (!isBusy) {
		// Customer customer = ticketBooth.getWatingCustomer();
		// if(customer == null)
		// return false;
		//
		// setBusy(true);
		// Customer ticketingCustomer = customer;
		// int startTicketingTime = Main.time;
		// int ticketingTime = customer.getTicketingTime();
		// int processTime = 0;
		// System.out.println("TICKETING TIME="+ticketingTime);
		// while (Main.time == startTicketingTime + ticketingTime) {
		// processTime++;
		// }
		//
		//
		// ticketingCustomer.setWaitTimeForTicketing(processTime);
		// ticketingCustomer.setTimeForTicketing(Main.time);
		// System.out.println("[AGENT] Process Custom="
		// + ticketingCustomer.toString());
		// platform.addCustomer(ticketingCustomer);
		// setBusy(false);
		// }
		return isBusy();
	}

	private void callCustomer() {
		processCustomer = ticketBooth.getWatingCustomer();
		if (processCustomer == null)
			setBusy(false);
		else {
			System.out.println("START TICKETING");
			startTicketingTime = Main.time;
			ticketingTime = processCustomer.getTicketingTime();
			setBusy(true);
		}
	}

	public boolean isBusy() {
		return isBusy;
	}

	private void setBusy(boolean busy) {
		isBusy = busy;
	}
}
