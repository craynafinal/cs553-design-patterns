public class Cake {
	private Decorator decorator = null;
	private String description = "cake";

	public void addDecorator(Decorator decorator) {
		decorator.setDecorator(this.decorator);
		this.decorator = decorator;
	}

	public String print() {
		return description + (decorator == null ? "" : " " + decorator.print());
	}
}
