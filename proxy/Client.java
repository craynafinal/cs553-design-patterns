import java.rmi.*;

/**
 *  This class implements a client of the remote calculator.
 */

public class Client {

	/**
	 *  The name of the server, e.g., "//graystar.cs.pdx.edu/calculator"
	 *  or simply "calculator" if the client executes on the server's host.
	 *  Used to lookup the server on a network.
	 */
	// name is no longer needed, CalculatorIF initialization is moved to Proxy class
	// private static final String name = "calculator";

	/**
	 *  Usual main, command line arguments are ignored.
	 *  Install security manager, lookup remote calculator,
	 *  request an addition, and print the result.
	 *  @param ignore Ditto.
	 */
	public static void main (String [] ignore) {

		Proxy proxy = new Proxy();
		
		float x = 3.3f;
		float y = 4.4f;
		System.out.println ("Client: Calculator result for add: " + proxy.add(x,y));
		System.out.println ("Client: Calculator result for sub: " + proxy.sub(x,y));
		System.out.println ("Client: Calculator result for times: " + proxy.times(x,y));
		System.out.println ("Client: Calculator result for divide: " + proxy.divide(x,y));

		/*
		System.setSecurityManager (new RMISecurityManager ());
		try {
			CalculatorIF calc = (CalculatorIF) Naming.lookup (name);
			float x = 3.3f;
			float y = 4.4f;
			System.out.println ("Client: Calculator result for add: " + calc.add(x,y));
			System.out.println ("Client: Calculator result for sub: " + calc.sub(x,y));
			System.out.println ("Client: Calculator result for times: " + calc.times(x,y));
			System.out.println ("Client: Calculator result for divide: " + calc.divide(x,y));	
		}
		catch (Exception e) {
			System.err.println ("Client exception: " + e.getMessage ());
			e.printStackTrace ();
		}
		*/
	}
}
