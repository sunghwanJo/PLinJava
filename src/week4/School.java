package week4;

import java.util.ArrayList;

import week4.dummy.DummyContent;
import week4.dummy.DummyContent.DummyItem;
import week4.maker.CreditReportMaker;
import week4.model.Student;

public class School {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		CreditReportMaker creditCalculator = new CreditReportMaker();
		
		for(DummyItem item : DummyContent.ITEMS){
			studentList.add(new Student(item.name, item.studentSerialNumber, item.majorSubject, item.mathPoint, item.englishPoint));
		}
		
		creditCalculator.makeCreditReport(studentList);
		creditCalculator.printReport();
		
	}

}
