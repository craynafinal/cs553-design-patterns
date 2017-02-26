import java.util.*;

// factory is static because it should be a singleton
public class FlyweightFactory {
	// because it is a singleton, block constructor by setting it as private
	private FlyweightFactory() {}	

	private static Hashtable table = new Hashtable();
	
	// the class that has to be flyweight object
	// one object with a certain property won't be made twice
	// this will be private static class to disallow clients to make instances
	private static class Glyph implements FlyweightIF {
		private final char c; // character
		private final int i; // size
		
		private Glyph(char c, int i) {
			this.c = c;
			this.i = i;
		}

		public void render() {
			// do something
		}
	}

	public static FlyweightIF get(char c, int i) {
		// dirty way to create a key
		String key = "" + c + "-" + i;
		Object value = table.get(key); // null if nothing

		if (value == null) {
			System.out.println("creating " + key);
			value = new Glyph(c, i);
			table.put(key, value);
		}

		return (FlyweightIF) value; // this will produce unsafe warning
	}
}
