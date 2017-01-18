// use the mutable object as if it were immutable (read-only interface)

public class Client {
	public static void main(String[] args) {
		System.out.println("Starting the program.");

		System.out.println("Initializing mutable and immutable position objects.");
		MutablePosition mp = new Position(1,1);
		ImmutablePosition ip = new Position(2,2);

		System.out.println("Checking mutable object.");
		int mx = 2;
		int my = 3;
		mp.setX(mx);
		mp.setY(my);

		System.out.println("Is x value changed?\n\t"
			+ Boolean.toString(mx == ((ImmutablePosition)mp).getX())
			+ "\nIs y value changed?\n\t"
			+ Boolean.toString(my == ((ImmutablePosition)mp).getY())
		);

		System.out.println("Checking immutable object.");
		int ix = 0;
		int iy = 1;
		
		// Following lines throw compile exception
		// ip.setX(ix);
		// ip.setY(iy);

		System.out.println("Checking the pos info of the immutable object: "
			+ ip.getX() + ", " + ip.getY());

		System.out.println("Casting to Position object.");
		((Position) ip).setX(ix);
		System.out.println("Result: x = " + ip.getX());

		System.out.println("Casting to MutablePosition object.");
		((MutablePosition) ip).setY(iy);
		System.out.println("Result: y = " + ip.getY());

		System.out.println("Ending the program.");
	}
}
