package mid.maze;

public class Maze {
	public static final int MAP_SIZE = 10;
	public static final boolean WALL=false;
	public static final boolean PATH=true;
	
	private Element entryElement; 
	private Element exitElement;
	
	public Maze(){
		entryElement = new Element(1, 1);
		exitElement = new Element(8, 8);
	}
	
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

	public Element getEntryElement() {
		return entryElement;
	}

	public void setEntryElement(Element entryElement) {
		this.entryElement = entryElement;
	}

	public Element getExitElement() {
		return exitElement;
	}

	public void setExitElement(Element exitElement) {
		this.exitElement = exitElement;
	}

	public boolean[][] getMap() {
		return map;
	}

	public void setMap(boolean[][] map) {
		this.map = map;
	}
	
	
	
}
