import java.io.PrintWriter;

public class Logger {

	public static final String textFile = "logger.txt";
	public static final String encoding = "UTF-8";
	private static PrintWriter printWriter = null;

	private static Logger logger = null;

	private Logger () {
		// will not be called by clients
	}

	public static Logger getInstance() {
		if (logger == null) {
			System.out.println("Logger setting:\n\ttextFile - " + textFile + "\n\tencoding - " + encoding);

			logger = new Logger();

			try {
				printWriter = new PrintWriter(textFile, encoding);
			} catch (Exception e) {
				throw new RuntimeException("Cannot initialize the print writer object.");
			}
		}

		return logger;
	}

	public static void writeLog(String message) {
		if (printWriter != null) {
			printWriter.println(message);
			printWriter.flush();
		}
	}
}
