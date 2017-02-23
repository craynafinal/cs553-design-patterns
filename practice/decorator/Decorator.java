public abstract class Decorator {
	private Decorator decorator = null;
	private String description = null;

	public Decorator(String description) {
		this.description = description;
	}

	public Decorator getDecorator() {
		return decorator;
	}

	public void setDecorator(Decorator decorator) {
		this.decorator = decorator;
	}

	public String print() {
		return description + " " + (decorator == null ? "" : decorator.print());
	}
}
