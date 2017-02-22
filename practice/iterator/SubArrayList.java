import java.util.*;

public class SubArrayList implements IteratorIF {
	private List<String> arrayList = new ArrayList<>();

	public void add (String content) {
		arrayList.add(content);
	}

	public Iterator getIterator() {
		return arrayList.iterator();
	}
}
