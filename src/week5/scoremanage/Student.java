package week5.scoremanage;

public class Student implements Comparable<Student>{
	String name;
	String serialNumber;
	Score score;
	
	public Student(String name, String serialNumber) {
		super();
		this.name = name;
		this.serialNumber = serialNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public void setScore(Score score){
		this.score = score;
	}
	
	public Score getScore(){
		return score;
	}

	@Override
	public boolean equals(Object obj) {
		Student stu = (Student)obj;
		if(this.getSerialNumber().equals(stu.getSerialNumber())){
			return true;
		}
		
		return false;
	}
	@Override
	public int compareTo(Student s) {
		if(s.getScore().getTotalPoint() < this.getScore().getTotalPoint())
			return 1;
		if(this.equals(s))
			return 0;
		return -1;
	}
	
	
}
