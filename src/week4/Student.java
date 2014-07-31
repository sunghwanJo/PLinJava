package week4;

import java.util.HashMap;

public class Student {

	private String name;
	private Integer studentSerialNumber;
	private String majorSubject;
	private HashMap<String, Integer> report;
	
	public Student(String name, int studentSerialNumber,
			String majorSubject, int mathPoint, int englishPoint) {
		this.name = name;
		this.studentSerialNumber = studentSerialNumber;
		this.majorSubject = majorSubject;
		
		report = new HashMap<String, Integer>();
		report.put("수학", mathPoint);
		report.put("영어", englishPoint);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStudentSerialNumber() {
		return studentSerialNumber;
	}

	public void setStudentSerialNumber(Integer studentSerialNumber) {
		this.studentSerialNumber = studentSerialNumber;
	}

	public String getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(String majorSubject) {
		this.majorSubject = majorSubject;
	}

	public HashMap<String, Integer> getReport() {
		return report;
	}

	public void setReport(HashMap<String, Integer> report) {
		this.report = report;
	}
	
	
}
