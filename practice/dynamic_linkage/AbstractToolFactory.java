public abstract class AbstractToolFactory {
	public static AbstractToolFactory getFactory(String factory) {
		try {
			return (AbstractToolFactory)Class.forName(factory).newInstance();
		} catch (Exception e) {
			return null;
		}
	}

	public abstract Tool getTool();
}
