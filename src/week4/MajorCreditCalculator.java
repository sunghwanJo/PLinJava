package week4;

public class MajorCreditCalculator implements ICreditCalculator {

	@Override
	public String calculate(Integer point) {
		if (95 <= point && point <= 100)
			return "S";
		else if (90 <= point)
			return "A";
		else if (80 <= point)
			return "B";
		else if (70 <= point)
			return "C";
		else if (60 <= point)
			return "D";
		else if (0 <= point)
			return "F";
		else
			return "X";
	}

}
