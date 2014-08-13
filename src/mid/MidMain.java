package mid;

import mid.maze.Maze;
import mid.maze.MazeSolver;

public class MidMain {

	public static void main(String[] args) {
		Maze maze = new Maze();
		MazeSolver mazeSolver = new MazeSolver(maze);
		
		mazeSolver.findPath();		
	}

}
