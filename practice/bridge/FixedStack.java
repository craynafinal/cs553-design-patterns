import java.util.*;

public class FixedStack implements StackImp {
	private final int SIZE = 10;
	private int currentIndex = -1;
	private List<String> stackList = new ArrayList<>();

	public String pop() {
		if (currentIndex >= 0 && currentIndex < 10) {
			return stackList.get(currentIndex);
		} else {
			return null;
		}
	}

	public boolean push(String value) {
		if (currentIndex < SIZE - 1) {
			stackList.add(++currentIndex, value);
			return true;
		} else {
			return false;
		}
	}
}
