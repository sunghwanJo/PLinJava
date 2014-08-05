package mid;

import java.util.HashMap;

import mid.DirectionMap.Direction;

public class DirectionMap extends HashMap<Integer, Direction>{
	private static final long serialVersionUID = 1L;
	
	public static final int NORTH=1;
	public static final int NORTH_EAST=2;
	public static final int EAST=3;
	public static final int SOUTH_EAST=4;
	public static final int SOUTH=5;
	public static final int SOUTH_WEST=6;
	public static final int WEST=7;
	public static final int NORTH_WEST=8;
	
	public DirectionMap(){
		//이곳에서 순환
		this.put(NORTH, new Direction(-1, 0));
		this.put(NORTH_EAST, new Direction(-1, 1));
		this.put(EAST, new Direction(0, 1));
		this.put(SOUTH_EAST, new Direction(1, 1));
		this.put(SOUTH, new Direction(1, 0));
		this.put(SOUTH_WEST, new Direction(1, -1));
		this.put(WEST, new Direction(0, -1));
		this.put(NORTH_WEST, new Direction(-1, -1));
	}

	public static class Direction {
		private int vertical;
		private int horizontal;
		
		public Direction(int vertical, int horizontal){
			this.vertical = vertical;
			this.horizontal = horizontal;
		}

		public int getVertical() {
			return vertical;
		}

		public int getHorizontal() {
			return horizontal;
		}
	}
	
}
