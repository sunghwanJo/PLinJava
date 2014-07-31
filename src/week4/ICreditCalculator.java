package week4;

import java.util.ArrayList;

public interface ICreditCalculator {
	
	public String calculateCredit(String subject, Integer point, int option);
	public void makeCreditReport(ArrayList<Student> studentList);
	public void printReport();
}
