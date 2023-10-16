package ki304.rybka.lab5;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

/**
 * Implementation of Lab5
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class App 
{
	/**
	 * Entry point of the application
	 * @param args Not used
	 * @throws FileNotFoundException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Locale.setDefault(Locale.US);
		double x = 0, y = 0;
		Scanner in = new Scanner(System.in);
		FileManager fileManager = new FileManager();

        try 
        {
    		 System.out.print("x = ");
    		 x = in.nextDouble();
    		 in.nextLine();
    		 
    		 Equation equation = new Equation();
    		 y = equation.calc(x);
    		 
    		 System.out.print("y = ");
    		 System.out.println(y);
    		 
    		 fileManager.saveResult(y);
    		 
    		 double result;
    		 // Test result from binary file
    		 try 
    		 {
    			 result = fileManager.readResultBin();
        		 System.out.println("Read from bin file:");
        		 System.out.print("y = ");
        		 System.out.println(result);
    		 }
    		 catch (IOException ex)
    		 {
    			 System.out.println("\nNo result");
    		 }
    		 // Test result from text file
    		 try 
    		 {
    			 result = fileManager.readResultTxt();
        		 System.out.println("Read from text file:");
        		 System.out.print("y = ");
        		 System.out.println(result);
    		 }
    		 catch (FileNotFoundException ex)
    		 {
    			 System.out.println("\nNo result");
    		 }
        }
        catch (CalcException ex)
        {
        	 System.out.print("[ERROR] ");
             System.out.print(ex.getMessage());
        }
        finally
        {
    		 in.close();
        }
	}
}
