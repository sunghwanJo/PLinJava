package week1;

/**
 * 
 * @author josunghwan
 *
 */
public class BirthDay {
	private int year;
	private int month;
	private int day;
	
	
	BirthDay(){
		
	}
	
	BirthDay(int year, int month, int day){
		setDate(year, month, day);
	}
	
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		
	}

	public boolean checkValidate(){
		if(year < 0)
			return false;
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return day>=0 && day<=31;
		case 4:
		case 6:
		case 9:
		case 11:
			return day>=0 && day<=30;
		case 2:
			if(year%400 == 0 || (year%4 ==0 && year%100!=0))
				return day>=0 && day<=29;
			return day>=0 && day <=28;	

		default:
			return false;
		}
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
}
