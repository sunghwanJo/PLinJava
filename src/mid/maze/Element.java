package mid.maze;

import mid.maze.direction.Direction;

public class Element {
	private int rowIndex;
	private int colIndex;
	private Direction direction;
	

	public Element(){
		
	}
	
	public Element(int rowIndex, int colIndex) {
		this();
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
	}
	
	public Element(int rowIndex, int colIndex, Direction direction) {
		this(rowIndex, colIndex);
		this.direction = direction;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + colIndex;
		result = prime * result + rowIndex;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Element other = (Element) obj;
		if (colIndex != other.colIndex)
			return false;
		if (rowIndex != other.rowIndex)
			return false;
		return true;
	}

	public int getRowIndex() {
		return rowIndex;
	}
	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}
	public int getColIndex() {
		return colIndex;
	}
	public void setColIndex(int colIndex) {
		this.colIndex = colIndex;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	
}
