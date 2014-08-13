package mid.maze.direction;

import java.util.Collection;
import java.util.HashMap;

public class Direction4Map implements IDirectionMap{
	
	private static HashMap<Integer, Direction> dMap = new HashMap<Integer, Direction>();
	public Direction4Map(){
		initialize();
	}
	@Override
	public void initialize() {
		dMap.put(Direction.NORTH, new Direction(-1, 0));
		dMap.put(Direction.EAST, new Direction(0, 1));
		dMap.put(Direction.SOUTH, new Direction(1, 0));
		dMap.put(Direction.WEST, new Direction(0, -1));
	}
	@Override
	public Direction get(Integer key) {
		return dMap.get(key);
	}
	@Override
	public Collection<Direction> values() {
		return dMap.values();
	}	
}
