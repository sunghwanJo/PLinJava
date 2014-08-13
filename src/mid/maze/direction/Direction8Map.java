package mid.maze.direction;

import java.util.Collection;
import java.util.HashMap;

public class Direction8Map implements IDirectionMap{
	
	private static HashMap<Integer, Direction> dMap = new HashMap<Integer, Direction>();
	public Direction8Map(){
		initialize();
	}

	@Override
	public Direction get(Integer key) {
		return dMap.get(key);
	}
	@Override
	public Collection<Direction> values() {
		return dMap.values();
	}	
	@Override
	public void initialize() {
		dMap.put(Direction.NORTH, new Direction(-1, 0));
		dMap.put(Direction.NORTH_EAST, new Direction(-1, 1));
		dMap.put(Direction.EAST, new Direction(0, 1));
		dMap.put(Direction.SOUTH_EAST, new Direction(1, 1));
		dMap.put(Direction.SOUTH, new Direction(1, 0));
		dMap.put(Direction.SOUTH_WEST, new Direction(1, -1));
		dMap.put(Direction.WEST, new Direction(0, -1));
		dMap.put(Direction.NORTH_WEST, new Direction(-1, -1));
		
	}
}
