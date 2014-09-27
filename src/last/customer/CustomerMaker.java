package last.customer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Logger;

import au.com.bytecode.opencsv.CSVReader;

public class CustomerMaker {
	private static final String TAG = CustomerMaker.class.getSimpleName();

	public static ArrayList<Customer> make() {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer customer;
		try {
			String filepath = "./src/last/customer_information.csv";
			CSVReader reader = new CSVReader(new InputStreamReader(
					new FileInputStream(new File(filepath)), "EUC-KR"), ',',
					'\'', 1);
			String[] nextLine;

			while ((nextLine = reader.readNext()) != null) {			
				Integer id = Integer.parseInt(nextLine[0]);
				String name = nextLine[1];
				Integer arrivedTime = Integer.parseInt(nextLine[2]);
				Integer ticketingTime = Integer.parseInt(nextLine[3]);
				String startStationName = nextLine[4];
				String arrivalStationName = nextLine[5];
				
				customer = Customer.makeCustomer(id, name, arrivedTime, ticketingTime, startStationName, arrivalStationName);
				customerList.add(customer);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MakeCustomerFailException e) {
			System.out.println(TAG+" Exception:"+e.getMessage());
		} catch (NumberFormatException e){
			System.out.println(TAG+" Exception:"+e.getMessage());
		}
		
		return customerList;
	}
}
