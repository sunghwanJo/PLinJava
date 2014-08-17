package week5.scoremanage;


import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class ScoreManagement {
	TreeMap<Student, Score> studentList;

	
	
	public ScoreManagement() {
		this.studentList = new TreeMap<Student, Score>();
	}

	public void addScore(Student student, Score score) {
		// compareTo의 0을 이해하지 못했을때 작성한 코드
		//if(checkDuplicationStudent(student)){
		//	System.out.println("중복된학생은 기입할 수 없음 : "+ student.getName() + ":" + student.getSerialNumber());
		//	return ;
		//}
		student.setScore(score);
		studentList.put(student, score);
	}

	public void displayAllScore() {
		NavigableMap<Student, Score> map = studentList.descendingMap();
		
		for(Map.Entry<Student, Score> ele : map.entrySet()){
			System.out.print("학생번호 : " + ele.getKey().getSerialNumber()+", ");
			System.out.print("학생이름 : " + ele.getKey().getName() + ", ");
			System.out.print("국어 : " + ele.getValue().getKor() + ", ");
			System.out.print("수학 : " + ele.getValue().getMath() + ", ");
			System.out.print("총점 : " + ele.getValue().getTotalPoint());
			System.out.println();
		}
		
		
	}
	
	//private boolean checkDuplicationStudent(Student student){
	//	Iterator<Student> iterator = studentList.keySet().iterator();
	//	
	//	while(iterator.hasNext()){
	//		Student stu = iterator.next();
	//		if(stu.equals(student)){
	//			return true;
	//		}
	//	}
	//	return false;
	//}
	
}
