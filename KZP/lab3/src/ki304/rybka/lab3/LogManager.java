/**
 * 
 */
package ki304.rybka.lab3;

import java.io.*;

/**
 * Class LogManager implements log manager
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class LogManager 
{
	private PrintWriter fileOut;
	/**
	 * Constructor of LogManager
	 * @throws FileNotFoundException 
	 */
	public LogManager() throws FileNotFoundException
	{
		File file = new File("log.txt");
		fileOut = new PrintWriter(file);
	}
	/**
	 * Show info message
	 * @param msg Message string
	 */
	public void info(String msg)
	{
		System.out.print("[INFO] ");
		System.out.println(msg);
		fileOut.print("[INFO] ");
		fileOut.println(msg);
		fileOut.flush();
	}
	/**
	 * Show error message
	 * @param msg Message string
	 */
	public void error(String msg)
	{
		System.out.print("[ERROR] ");
		System.out.println(msg);
		fileOut.print("[INFO] ");
		fileOut.println(msg);
		fileOut.flush();
	}
	/**
	 * Close file
	 */
	public void close()
	{
		fileOut.close();
	}
}
