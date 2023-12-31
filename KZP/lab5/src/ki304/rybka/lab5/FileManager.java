/**
 * 
 */
package ki304.rybka.lab5;

import java.io.*;
import java.util.Scanner; 

/**
 * Class FileManager implements working with files
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class FileManager 
{
	/**
	 * Text file name
	 */
	private String txtFileName = "data.txt";
	/**
	 * Binary file name
	 */
	private String binFileName = "data.bin";
	/**
	 * Constructor of FileManager
	 */
	public FileManager() {}
	/**
	 * Saves double value to the text and binary files
	 * @throws FileNotFoundException 
	 * @throws IOException 
	 */
	public void saveResult(double result)
	{
		try (PrintWriter fileOutTxt = new PrintWriter(new File(txtFileName)))
		{
			fileOutTxt.print(result);
			fileOutTxt.flush();
		}
		catch (FileNotFoundException ex)
		{
			System.out.print("[ERROR] Text file not found!");
		}
		
		try (DataOutputStream fileOutBin = new DataOutputStream(new FileOutputStream(binFileName)))
		{
			fileOutBin.writeDouble(result);
			fileOutBin.flush();
		}
		catch (IOException ex)
		{
			System.out.print("[ERROR] Binary file writing error!");
		}
	}
	/**
	 * Reads double value from text file
	 * @throws FileNotFoundException 
	 */
	public double readResultTxt() throws FileNotFoundException
	{
		double result = 0;
		try (Scanner scanner = new Scanner(new File(txtFileName)))
		{
			result = scanner.nextDouble();
		}
		catch (FileNotFoundException ex)
		{
			System.out.print("[ERROR] Text file with result not found!");
			throw ex;
		}
		return result;
	}
	/**
	 * Reads double value from binary file
	 * @throws IOException 
	 */
	public double readResultBin() throws IOException
	{
		double result = 0;
		try (DataInputStream file = new DataInputStream(new FileInputStream(binFileName)))
		{
	        result = file.readDouble();
		}
		catch (IOException ex)
		{
			System.out.print("[ERROR] Binary file reading error!");
			throw ex;
		}
		return result;
	}
}
