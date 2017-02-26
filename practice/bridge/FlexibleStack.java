import java.util.*;

public class FlexibleStack implements StackImp {
  private List<String> stackList = new ArrayList<>();
	private int currentIndex = -1;

  public String pop() {
		if (currentIndex < 0) {
			return null;
		}
    return stackList.get(currentIndex);
  }

  public boolean push(String value) {
		stackList.add(++currentIndex, value);
		return true;
  }
}

