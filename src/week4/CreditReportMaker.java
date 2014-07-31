package week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CreditReportMaker implements ICreditReportMaker {
	private static final int MAJOR_SUBJECT = 1;
	private static final int NON_MAJOR_SUBJECT = 2;

	public HashMap<Student, HashMap<String, String>> creditReport = new HashMap<Student, HashMap<String, String>>();
	private ICreditCalculator creditCalculator;

	public String calculateCredit(Integer point, int option) {
		String credit;
		switch (option) {
		case MAJOR_SUBJECT:
			creditCalculator = new MajorCreditCalculator();
			credit = creditCalculator.calculate(point);
			break;
		case NON_MAJOR_SUBJECT:
			creditCalculator = new NonMajorCreditCalculator();
			credit = creditCalculator.calculate(point);
			break;
		default:
			credit = "X";
		}
		return credit;
	}

	@Override
	public void makeCreditReport(ArrayList<Student> studentList) {
		HashMap<String, String> creditResult;
		Iterator<String> iterator;

		for (Student student : studentList) {
			creditResult = new HashMap<String, String>();
			iterator = student.getReport().keySet().iterator();

			while (iterator.hasNext()) {
				String subjectName = (String) iterator.next();
				String credit;
				int point;

				point = student.getReport().get(subjectName);
				if (student.getMajorSubject().equals(subjectName))
					credit = calculateCredit(point, MAJOR_SUBJECT);
				else
					credit = calculateCredit(point, NON_MAJOR_SUBJECT);

				creditResult.put(subjectName, credit);
			}
			creditReport.put(student, creditResult);
		}
	}

	public void printStudentReport(Student student,
			HashMap<String, String> studentReport) {
		System.out.println("\tName : " + student.getName() + " | Serail : "
				+ student.getStudentSerialNumber() + "  | Major Subject :"
				+ student.getMajorSubject());

		Iterator<String> iterator;
		iterator = studentReport.keySet().iterator();

		while (iterator.hasNext()) {
			String subjectName = (String) iterator.next();
			String credit = studentReport.get(subjectName);
			int point = student.getReport().get(subjectName);

			System.out.println("\t\t[" + subjectName + "] : " + point + " : "
					+ credit);
		}

	}

	@Override
	public void printReport() {
		Iterator<Student> iterator;
		iterator = creditReport.keySet().iterator();
		HashMap<String, String> studentReport;

		System.out.println("Students[" + creditReport.size() + "] Report");

		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			studentReport = creditReport.get(student);
			printStudentReport(student, studentReport);
		}

		System.out.println("End Report");

	}

}
