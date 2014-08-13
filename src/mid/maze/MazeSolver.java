package mid.maze;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Properties;

import mid.maze.direction.Direction;
import mid.maze.direction.Direction4Map;
import mid.maze.direction.IDirectionMap;
import mid.stack.ElementStack;

public class MazeSolver {
	private ElementStack stack;
	private Maze maze;
	private IDirectionMap directionMap;
	private boolean[][] visitMaker;
	private Properties prop;
	private void initSetting() {
		prop = new Properties();
		InputStream input = null;

		
		try {
			input = new FileInputStream("config.properties");
			prop.load(input);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public MazeSolver() {
		try {
			initSetting();
			String directionType = prop.getProperty("direction");		
			directionMap = (IDirectionMap)Class.forName("mid.maze.direction.Direction"+directionType+"Map").newInstance();
			stack = new ElementStack();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public MazeSolver(Maze maze) {
		this();
		this.maze = maze;
		visitMaker = new boolean[Maze.MAP_SIZE][Maze.MAP_SIZE];
		for (boolean[] items : visitMaker) {
			Arrays.fill(items, false);
		}

	}

	public void findPath() {
		Element position;
		Element nextPosition;
		boolean pathFound = false;
		Iterator<Direction> iterator;

		int startDirection = Direction.NORTH;
		Direction mDirection;

		mDirection = directionMap.get(startDirection);
		position = new Element(maze.getEntryElement().getRowIndex(), maze
				.getEntryElement().getColIndex(), mDirection);
		stack.push(position);
		visitMaker[maze.getEntryElement().getRowIndex()][maze.getEntryElement()
				.getColIndex()] = true;
		try {
			while (!stack.isEmpty() && pathFound == false) {
				position = (Element) stack.pop();

				iterator = directionMap.values().iterator();
				
				while (iterator.hasNext() && pathFound == false) {
					int nextRow, nextCol;
					mDirection = (Direction) iterator.next();
					position.setDirection(mDirection);

					nextRow = position.getRowIndex()
							+ position.getDirection().getVertical();
					nextCol = position.getColIndex()
							+ position.getDirection().getHorizontal();
					nextPosition = new Element(nextRow, nextCol);

					if (nextPosition.equals(maze.getExitElement())) {
						stack.push(position);
						stack.push(maze.getExitElement());
						pathFound = true;
					} else if (maze.getMap()[nextRow][nextCol] == Maze.PATH
							&& visitMaker[nextRow][nextCol] == false) {
						// iterator.next();
						visitMaker[nextRow][nextCol] = true;
						stack.push(position);
						iterator = directionMap.values().iterator();
						position = nextPosition;

					} else {
						// iterator.next();
					}
				}
			}

		} catch (NoSuchElementException e) {
			System.out.println("No Such Element");
		}
		if (pathFound == true) {
			printSolve();
		} else {
			System.out.println("Can't Solve");
		}
	}

	private void printSolve() {
		int i = 0;
		int delayTime;
		Element[] elements = stack.getStack();
		delayTime = Integer.parseInt(prop.getProperty("speed"));
		while (true) {
			clearConsole();
			System.out.println("Success (" + i + ")");
			printMaze(elements[i++]);
			try {
				Thread.sleep(delayTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (elements[i] == null) {
				System.out.println("END");
				break;
			}
		}
	}

	public void printMaze(Element e) {
		int col = 1;
		int row = 1;

		if (e != null) {
			col = e.getColIndex();
			row = e.getRowIndex();
		}
		for (int i = 1; i < maze.MAP_SIZE - 1; i++) {
			for (int j = 1; j < maze.MAP_SIZE - 1; j++) {
				if (maze.getMap()[i][j] == Maze.WALL) {
					System.out.print("▦ ");
				} else if (i == row && j == col) {
					System.out.print("♤ ");
				} else if (maze.getMap()[i][j] == Maze.PATH) {
					System.out.print("꒴ ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

	public void clearConsole() {
		for (int i = 0; i < 30; i++) {
			System.out.println();
		}

	}

}
