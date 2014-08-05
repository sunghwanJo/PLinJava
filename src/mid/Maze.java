package mid;

public class Maze {
	public static final int MAP_SIZE = 10;
	public static final boolean WALL=false;
	public static final boolean PATH=true;
	
	
	private boolean[][] map = {
			{WALL, WALL , WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL},
			{WALL, PATH , WALL, WALL, WALL, PATH, WALL, WALL, WALL, WALL},
			{WALL, PATH , PATH, PATH, WALL, PATH, PATH, PATH, PATH, WALL},
			{WALL, WALL , WALL, PATH, PATH, PATH, WALL, PATH, WALL, WALL},
			{WALL, WALL , WALL, PATH, WALL, WALL, WALL, PATH, WALL, WALL},
			{WALL, WALL , PATH, PATH, WALL, PATH, PATH, PATH, PATH, WALL},
			{WALL, PATH , WALL, WALL, WALL, PATH, WALL, WALL, WALL, WALL},
			{WALL, WALL , PATH, WALL, WALL, PATH, PATH, PATH, PATH, WALL},
			{WALL, PATH , WALL, WALL, PATH, WALL, WALL, WALL, PATH, WALL},
			{WALL, WALL , WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL}
	};
	
	
	
}
