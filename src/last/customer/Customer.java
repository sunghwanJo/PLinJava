package last.customer;

public class Customer {
	private int id;
	private String name;
	private int arrivedTime;
	private int ticketingTime;
	private int startStation;
	private int arrivalStation;
	
	//이하 출력정보
	private int waitTimeForTicketing;
	private int timeForTicketing;
	private int waitTimeForTrain;

	// 열차가 출발한 시간 + 알고리즘으로 구한 시간
	private int arrivedTimeToTrain;
	
	private Customer(int id, String name, int arrivedTime, int ticketingTime,
			int startStation, int arrivalStation) {
		this.id = id;
		this.name = name;
		this.arrivedTime = arrivedTime;
		this.ticketingTime = ticketingTime;
		this.startStation = startStation;
		this.arrivalStation = arrivalStation;
	}
	
	public static Customer makeCustomer(Integer id, String name, Integer arrivedTime, Integer ticketingTime,
			String startStationName, String arrivalStationName) throws MakeCustomerFailException{

		if( id == null || name == null || arrivedTime == null || ticketingTime == null || startStationName==null || arrivalStationName == null)
			throw new MakeCustomerFailException("고객 정보가 부족합니다.");
		
		StationContract stationMap = StationContract.getMap();
		int startStation = stationMap.get(startStationName);
		int arrivalStation = stationMap.get(arrivalStationName);
		
		Customer customer = new Customer(id, arrivalStationName, arrivedTime, ticketingTime, startStation, arrivalStation);
		
		return customer;
	}

	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id+":"+
		name+":"+
		arrivedTime+":"+
		ticketingTime+":"+
		//startStation;
		//arrivalStation;
		
		//이하 출력정보
		waitTimeForTicketing+":"+
		timeForTicketing+":"+
		waitTimeForTrain);
		return sb.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArrivedTime() {
		return arrivedTime;
	}

	public void setArrivedTime(int arrivedTime) {
		this.arrivedTime = arrivedTime;
	}

	public int getTicketingTime() {
		return ticketingTime;
	}

	public void setTicketingTime(int ticketingTime) {
		this.ticketingTime = ticketingTime;
	}

	public int getStartStation() {
		return startStation;
	}

	public void setStartStation(int startStation) {
		this.startStation = startStation;
	}

	public int getArrivalStation() {
		return arrivalStation;
	}

	public void setArrivalStation(int arrivalStation) {
		this.arrivalStation = arrivalStation;
	}

	public int getWaitTimeForTicketing() {
		return waitTimeForTicketing;
	}

	public void setWaitTimeForTicketing(int waitTimeForTicketing) {
		this.waitTimeForTicketing = waitTimeForTicketing;
	}

	public int getTimeForTicketing() {
		return timeForTicketing;
	}

	public void setTimeForTicketing(int timeForTicketing) {
		this.timeForTicketing = timeForTicketing;
	}

	public int getWaitTimeForTrain() {
		return waitTimeForTrain;
	}

	public void setWaitTimeForTrain(int waitTimeForTrain) {
		this.waitTimeForTrain = waitTimeForTrain;
	}

	public int getArrivedTimeToTrain() {
		return arrivedTimeToTrain;
	}

	public void setArrivedTimeToTrain(int arrivedTimeToTrain) {
		this.arrivedTimeToTrain = arrivedTimeToTrain;
	}

	
}
