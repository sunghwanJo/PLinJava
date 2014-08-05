package week4sort;

import java.util.HashMap;

public class SortSelector {
	private String type;
	private static HashMap<String, ISort> sortMap = new HashMap<String, ISort>(){
		private static final long serialVersionUID = 1L;
		{
			put("Q", new QuickSort());
			put("I", new InsertionSort());
			put("B", new BubbleSort());
		}
	};
	
	
	public SortSelector(){
		this("I");
	}
	
	public SortSelector(String type) {
		this.type = type;
	}
	
	public void sort(){
		System.out.println(sortMap.get(type).getClass().getSimpleName());
		sortMap.get(type).sort();
		System.out.println("=================================");
	}
	
	public void setType(String type){
		this.type = type;
	}
	
}
