package ki304.rybka.lab4;

import java.io.*; 
import java.util.Scanner;
import java.lang.Math;

/**
 * Implementation of Lab4
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class App 
{
	/**
	 * Entry point of the application
	 * @param args Not used
	 * @throws FileNotFoundException File not found exception
	 */
	public static void main(String[] args) throws FileNotFoundException 
	{
		 double x = 0, y = 0;
		 Scanner in = new Scanner(System.in);
		 File file = new File("file.txt");
		 PrintWriter fileOut = new PrintWriter(file);
         try 
         {
    		 System.out.print("x = ");
    		 x = in.nextDouble();
    		 in.nextLine();
    		 
    		 Equation equation = new Equation();
    		 y = equation.calc(x);
    		 
    		 System.out.print("y = ");
    		 System.out.print(y);
    		 
    		 fileOut.write("x = ");
    		 fileOut.write(Double.toString(x));
    		 fileOut.write("\n");
    		 fileOut.write("y = (x - 4) / sin(3 * x - 1) = ");
    		 fileOut.write(Double.toString(y));
         }
         catch (CalcException ex)
         {
        	 System.out.print("[ERROR] ");
             System.out.print(ex.getMessage());
         }
         finally
         {
    		 fileOut.flush();
    		 fileOut.close();
    		 in.close();
         }
	}
}
