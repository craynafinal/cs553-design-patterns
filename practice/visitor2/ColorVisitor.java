public class ColorVisitor implements Visitor {
	private String color = null;

	public ColorVisitor(String color) {
		this.color = color;
	}

	public void visit(Box box) {
		for (Base b : box.getList())
			b.accept(this);	
	}

	public void visit(Ball ball) {
		ball.setColor(color);
	}
}
