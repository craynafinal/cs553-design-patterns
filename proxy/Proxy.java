import java.rmi.*;

// only changes for the proxy is the client and the new proxy class
// this proxy class will handle some of the work that client code was doing

// implements the Calculator Interface which the Calculator class implements
// it will be a thin layer between Calculator (service) and the client code
public class Proxy implements CalculatorIF {
	private static final String name = "calculator";

	// the actual Calculator class object that will be called
	private CalculatorIF calc = null;

	public Proxy() {
		setupFromMain();
	}

	// this function sets up the object
	// the calculation methods will be provided for the client separately
	public void setupFromMain() {
		System.setSecurityManager (new RMISecurityManager ());
    try {
      CalculatorIF calc = (CalculatorIF) Naming.lookup(name);
      // float x = 3.3f;
      // float y = 4.4f;
      // System.out.println ("Client: Calculator result for add: " + calc.add(x,y));
      // System.out.println ("Client: Calculator result for sub: " + calc.sub(x,y));
      // System.out.println ("Client: Calculator result for times: " + calc.times(x,y));
      // System.out.println ("Client: Calculator result for divide: " + calc.divide(x,y));
    }
    catch (Exception e) {
      System.err.println ("Client exception: " + e.getMessage ());
      e.printStackTrace ();
    }
	}

	private float returnError(Exception e) {
		System.out.println("Client exception: " + e.getMessage());
		e.printStackTrace();
		return Float.NaN;
	}

	public float add (float x, float y) {
		try {
			return calc.add(x, y);
		} catch (Exception e) {
			return returnError(e);
		}
	}

	public float sub (float x, float y) {
		try {
			return calc.sub(x, y);
		} catch (Exception e) {
			return returnError(e);
		}
	}

	public float times (float x, float y) {
		try {
			return calc.times(x, y);
		} catch (Exception e) {
			return returnError(e);
		}
	}

	public float divide (float x, float y) {
		try {
			return calc.divide(x, y);
		} catch (Exception e) {
			return returnError(e);
		}	
	}
}
