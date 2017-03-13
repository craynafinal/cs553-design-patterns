public class Client {
	public static void main(String[] args) {
		Box box = new Box();
		box.addBase(new Ball());

		Box innerBox = new Box();
		innerBox.addBase(new Ball());

		box.addBase(innerBox);

		ColorVisitor colorVisitor = new ColorVisitor("Red");
		box.accept(colorVisitor);

		System.out.println(box);
	}
}
