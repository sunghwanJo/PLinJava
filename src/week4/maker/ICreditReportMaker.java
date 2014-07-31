package week4.maker;

import java.util.ArrayList;

import week4.model.Student;

public interface ICreditReportMaker {
	
	public void makeCreditReport(ArrayList<Student> studentList);
	public void printReport();
}
