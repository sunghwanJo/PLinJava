package week4;

import java.util.ArrayList;

import week4.dummy.DummyContent;
import week4.dummy.DummyContent.DummyItem;

public class School {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		CreditCalculator creditCalculator = new CreditCalculator();
		
		for(DummyItem item : DummyContent.ITEMS){
			studentList.add(new Student(item.name, item.studentSerialNumber, item.majorSubject, item.mathPoint, item.englishPoint));
		}
		
		creditCalculator.makeCreditReport(studentList);
		creditCalculator.printReport();
		
	}

}
