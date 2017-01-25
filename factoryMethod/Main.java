public class Main {
	/**
		*  Standard entry.  The program reads a single integer.
		*  The integer stands for a login id. Different ranges
		*  of ids give accounts of different classes.
		*/
	public static void main (String [] loginIDarray) {
		if (loginIDarray.length != 1) {
			System.err.println ("Command requires an argument");
			System.exit (1);
		}
		int loginId = -1;
		
		try {
			loginId = Integer.parseInt (loginIDarray [0]);
		}	catch (NumberFormatException ex) {
			System.err.println ("Argument must be an integer");
			System.exit (1);
		}

		FactoryMethod factory = null;
		
		if (1000 < loginId && loginId <= 5000)
			factory = new FactoryMethodEconomy ();
			// Standard and professional factories haven't been code, yet
			// else if (5000 < loginId && loginId <= 8000)
			// 	factory = new FactoryMethodStandard ();
			// else if (8000 < loginId && loginId <= 9999)
			// 	factory = new FactoryMethodProfessonal ();
		else {
			System.err.println ("Argument out of range");
			System.exit (1);
		}

		// Note how the following code is independent of the
		// account type: economy, standard or professional. 
		User user = factory.createUser (loginId);
		System.out.println (user);
	}
}
