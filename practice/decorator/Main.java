public class Main {
	public static void main(String[] args) {
		Cake cake = new Cake();

		cake.addDecorator(new Chocolate());
		cake.addDecorator(new Jam());

		System.out.println(cake.print());
	}
}
