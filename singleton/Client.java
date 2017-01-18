import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Client {
	public static void main(String[] args) {

		System.out.println("Starting up the program.");

		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();

		System.out.println("Are two instances the same?");
		System.out.println("\t" + Boolean.toString(logger1 == logger2));

		String msg1 = "Message1";
		String msg2 = "Message2";

		System.out.println("Writing some logs: " + msg1 + " and " + msg2);
		logger1.writeLog(msg1);
		logger2.writeLog(msg2);

		System.out.println("Checking the file content.");

		try {
			BufferedReader br = new BufferedReader(new FileReader(Logger.textFile));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println("\t" + line);
			}
		} catch (Exception e) {
			System.out.println("Failed to check the file content.");
		}

		System.out.println("Ending the program.");

	}
}
