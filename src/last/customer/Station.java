package last.customer;

import java.util.HashMap;

public class Station extends HashMap<String, Integer>{
	private static final long serialVersionUID = 1L;
	
	public static Station mInstance;
	
	{
		this.put("Seoul", 0);
		this.put("Chuncheon", 1);
		this.put("Asan", 1);
		this.put("Wonju", 1);
		this.put("Gyeongju", 1);
		this.put("Deajeon", 1);
		this.put("Gwangju", 1);
	}
	
	public static Station getMap(){
		if(mInstance == null)
			mInstance = new Station();
		return mInstance;
	}
	
	
}
