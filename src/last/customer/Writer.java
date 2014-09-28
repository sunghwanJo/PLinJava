package last.customer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.PriorityQueue;

public class Writer {
	public String filepath = "./src/last/customer_information_result.csv";
	
	public void writeCustomer(PriorityQueue<Customer> resultQueue){
		try {
            File resultFile = new File(filepath);
            BufferedWriter bw = new BufferedWriter(new FileWriter(resultFile));

            bw.write(Customer.toCsvTitleString());
            while(resultQueue.peek() != null){
            	bw.write(resultQueue.poll().toCsvString());
            }
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
