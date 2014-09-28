package last.station.ticket;

import last.Main;
import last.customer.Customer;
import last.station.platform.Platform;

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
		//티켓팅하는데 걸리는 시간 대기시간.  == 받은시간 - 도착시간
		//private int waitTimeForTicketing;
		//티켓을 받은시간
		//private int timeForTicketing;
		
		if (isBusy()) {
			processTime++;
			if (Main.time == startTicketingTime + ticketingTime) {
				processCustomer.setTimeForTicketing(Main.time);
				platform.addCustomer(processCustomer);
				callCustomer();
			}

			return isBusy();
		} else {
			
			callCustomer();
		}

		return isBusy();
	}

	private void callCustomer() {
		processCustomer = ticketBooth.getWatingCustomer();
		if (processCustomer == null)
			setBusy(false);
		else {
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
