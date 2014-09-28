package last.station;

import java.util.HashMap;

public class StationContract extends HashMap<String, Integer>{
	private static final long serialVersionUID = 1L;
	
	public static StationContract mInstance;
	{
		this.put("Seoul", 0);
		this.put("Chuncheon", 1);
		this.put("Asan", 2);
		this.put("Wonju", 3);
		this.put("Gyeongju", 4);
		this.put("Deajeon", 5);
		this.put("Gwangju", 6);
	}
	
	public static StationContract getMap(){
		if(mInstance == null)
			mInstance = new StationContract();
		return mInstance;
	}
	
	public static String getStationName(int i){
		for(String name : getMap().keySet()){
			if(getMap().get(name) == i){
				return name;
			}
		}
		return "";
	}
	
}
