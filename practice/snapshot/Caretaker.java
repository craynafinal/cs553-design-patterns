import java.util.*;

public class Caretaker {
	private List<Memento> mementos = new ArrayList<>();

	public int addMemento(Memento memento) {
		mementos.add(memento);
		return mementos.size() - 1;
	}

	public Memento getMemento(int index) {
		return mementos.get(index);
	}
}
