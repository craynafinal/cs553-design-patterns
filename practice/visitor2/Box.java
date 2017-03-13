import java.util.*;

public class Box implements Base {
	private List<Base> content = new ArrayList<>();

	public List<Base> getList() {
		return content;
	}

	public void addBase(Base base) {
		content.add(base);
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();

		for (Base b : content)
			sb.append(b + "\n");

		return sb.toString();
	}
}
