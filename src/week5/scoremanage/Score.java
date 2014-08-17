package week5.scoremanage;

public class Score {
	String serialNumber;
	int kor;
	int math;
	public Score(String serialNumber, int kor, int math) {
		super();
		this.serialNumber = serialNumber;
		this.kor = kor;
		this.math = math;
	}
	
	public int getTotalPoint(){
		return this.kor + this.math;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
}
