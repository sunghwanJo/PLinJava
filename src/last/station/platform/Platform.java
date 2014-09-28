package last.station.platform;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import last.Main;
import last.customer.Customer;

public class Platform {
	private static Platform mInstance;
	private static int waitTime = 0;
	private Queue<Customer> customerList;
	private ArrayList<Customer> train;
	private Dikstra dikstra;

	public static Platform getInstance() {
		if (mInstance == null) {
			mInstance = new Platform();
		}
		return mInstance;
	}

	private Platform() {
		customerList = new LinkedList<Customer>();
		train = new ArrayList<Customer>();
		dikstra = new Dikstra();
		dikstra.init();
	}

	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}

	public void boardTrain() {
		waitTime++;
		if (Main.time % 3 == 0) {
				while (!customerList.isEmpty()) {
					Customer tempCustomer = customerList.poll();
					customerList.remove(tempCustomer);
					
					train.add(tempCustomer);
					int cost = dikstra.getCostTime(
							tempCustomer.getStartStation(),
							tempCustomer.getArrivalStation());
					tempCustomer.setWaitTimeForTrain(waitTime);
					tempCustomer.setArrivedTimeToTrain(cost);
					Main.resultQueue.add(tempCustomer);
					waitTime=0;
				}
		}
	}
}
