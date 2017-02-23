public class Balloon {
	private String color = "";
	private boolean inflated = false;

	public void setColor(String color) {
		this.color = color;
	} 

	public void setInflated(boolean inflated) {
		this.inflated = inflated;
	}

	public String toString() {
		return this.color + ", " + (this.inflated ? "" : "not") + " inflated";
	}
}
