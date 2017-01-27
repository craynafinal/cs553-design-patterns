public class Client {
	public static void main(String[] args) {
		// initializing some nodes
		System.out.println("Creating nodes");
		ComparableIF c_1 = new Comparable(1);
		ComparableIF c_2 = new Comparable(2);
		ComparableIF ac_apple = new AnotherComparable("apple");
		ComparableIF ac_orange = new AnotherComparable("orange");
		ComparableIF ac_banana = new AnotherComparable("banana");

		// create a linked list
		System.out.println("Creating the linked list");
		LinkedList ll = new LinkedList(c_1, 
			new LinkedList(c_2,
				new LinkedList(ac_apple,
					new LinkedList(ac_orange))));	

		LinkedList ll_null = new LinkedList(null);

		// check the size
		System.out.println("The size of the linked list: " + ll.size());

		// perform find method
		System.out.println("Did find method find the node in the linked list? " +
			Boolean.toString(ll.find(c_1) != null) +
			"\nDid find method return null for the node not in the linked list? " +
			Boolean.toString(ll.find(ac_banana) == null) +
			"\nDid find method return null for the null node not in the linked list? " +
			Boolean.toString(ll.find(null) == null) +
			"\nDid find method find null node in the linked list? " +
			Boolean.toString(ll_null.find(null) != null)
		);
	}
}
