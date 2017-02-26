public class Stack {
	private StackImp stack = new FixedStack();

	public void push(String value) {
		if (!stack.push(value))	{
			System.out.println("changing stackimp object");
			stack = new FlexibleStack();
			stack.push(value);
		}
	}

	public String pop() {
		return stack.pop();
	}
}
