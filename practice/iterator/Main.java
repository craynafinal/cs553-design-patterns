import java.util.*;

public class Main {
	public static void main (String[] args) {
		IteratorIF structure = new SubArrayList();

		structure.add("test1");
		structure.add("test2");

		Iterator iter	= structure.getIterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}		
	}
}
