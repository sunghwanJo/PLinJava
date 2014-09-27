package last.customer;

import java.util.HashMap;

public class StationContract extends HashMap<String, Integer>{
	private static final long serialVersionUID = 1L;
	
	public static StationContract mInstance;
	
	{
		this.put("Seoul", 0);
		this.put("Chuncheon", 1);
		this.put("Asan", 1);
		this.put("Wonju", 1);
		this.put("Gyeongju", 1);
		this.put("Deajeon", 1);
		this.put("Gwangju", 1);
	}
	
	public static StationContract getMap(){
		if(mInstance == null)
			mInstance = new StationContract();
		return mInstance;
	}
	
	
}
