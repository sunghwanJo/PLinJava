package last.station.platform;

import last.Main;
import last.station.StationContract;

public class Dikstra {
	private static final int X = 30000;

	private int[][] graph;
	private int[] v;
	private int[] distance;
	private int[] via;
	
	private int size;
	
	public Dikstra() {
		
	}
	
	public void init(){
		graph = new int[][]{
				{0, 16, 20, 22, X, 29, X},
				{16, 0, X, 28, 31, X, X},
				{20, X, 0, X, X, 35, 25},
				{22, 28, X, 0, 32, 23, X},
				{X, 31, X, 32, 0, 15, 18},
				{29, X, 35, 23, 15, 0, 12},
				{X, X, 25, X, 18, 12, 0}
		};
		size = StationContract.getMap().size();
		v = new int[size];
		distance = new int[size];
		via = new int[size];
	}
	
	public int getCostTime(int startStation, int arrivalStation){
		int min=0;
		int j,i,k=0;
		
		for(i=0; i<size; i++){
			v[i] = 0;
			distance[i]=X;
		}
		distance[startStation] = 0;
		
		for(i=0; i<size; i++){
			min = X;
			for(j=0; j<size; j++){
				if(v[j]==0 && distance[j] < min){
					k=j;
					min = distance[j];
				}
			}
			v[k] = 1;
			if(min == X) break;
			
			for(j=0; j<size; j++){
				if(distance[j] > distance[k]+graph[k][j]){
					distance[j] = distance[k] + graph[k][j];
					via[j] = k;
				}
			}
		}
		
		return distance[arrivalStation] + Main.time;
	}
}
