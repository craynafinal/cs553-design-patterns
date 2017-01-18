class Position implements ImmutablePosition, MutablePosition {
	private int x;
	private int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	} // constructor(int, int)

	public int getX() { return x; }
	public int getY() { return y; }

	// assignment instruction: make x and y mutable
	public void setX(int value) { x = value; }
	public void setY(int value) { y = value; }

	public Position offset(int xOffset, int yOffset) {
		return new Position(x+xOffset, y+yOffset);
	} // offset(int, int)
} // class Position
