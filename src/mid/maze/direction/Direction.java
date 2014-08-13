package mid.maze.direction;

public class Direction {
	public static final int NORTH=1;
	public static final int NORTH_EAST=2;
	public static final int EAST=3;
	public static final int SOUTH_EAST=4;
	public static final int SOUTH=5;
	public static final int SOUTH_WEST=6;
	public static final int WEST=7;
	public static final int NORTH_WEST=8;
	
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

	@Override
	public String toString() {
		return this.vertical + " : " + this.horizontal;
				
	}		
}