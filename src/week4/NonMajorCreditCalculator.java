package week4;

public class NonMajorCreditCalculator implements ICreditCalculator {

	@Override
	public String calculate(Integer point) {
		if (90 <= point && point <= 100)
			return "A";
		else if (80 <= point)
			return "B";
		else if (70 <= point)
			return "C";
		else if (55 <= point)
			return "D";
		else if (0 <= point)
			return "F";
		else
			return "X";
	}

}
