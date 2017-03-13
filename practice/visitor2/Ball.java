public class Ball implements Base {
	private String color = null;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String toString() {
		return color;	
	}
}
