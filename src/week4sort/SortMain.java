package week4sort;

public class SortMain {
	
	public static void main(String[] args) {
		SortSelector sortSelector = new SortSelector();
		
		sortSelector.sort();
		sortSelector.setType("B");
		sortSelector.sort();
		sortSelector.setType("Q");
		sortSelector.sort();
		
	}
}
