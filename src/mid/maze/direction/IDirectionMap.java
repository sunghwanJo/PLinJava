package mid.maze.direction;

import java.util.Collection;

public interface IDirectionMap {
	public void initialize();
	public Direction get(Integer key);
	public Collection<Direction> values();
}