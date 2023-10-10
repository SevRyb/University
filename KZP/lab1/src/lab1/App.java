package lab1;

import java.io.*; 
import java.util.Scanner;
import java.lang.Math;

/**
 * Implementation of Lab1
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class App 
{

	/**
	 * Entry point of the application
	 * @param args  Not used
	 * @throws FileNotFoundException  File not found exception
	 */
	public static void main(String[] args) throws FileNotFoundException 
	{
		 int n;
		 char[][] arr;
		 char filler;
		 
		 Scanner in = new Scanner(System.in);
	     File file = new File("file.txt");
	     PrintWriter fileOut = new PrintWriter(file);
		 
		 while (true)
		 {
			 System.out.print("Enter matrix size (numbers >=3): ");
			 n = in.nextInt();
			 in.nextLine();
			 if (n >= 3)
				 break;
			 System.out.println("Must be numbers >=3");
		 }
		 
		 System.out.print("Enter filler char: ");
		 filler = in.next().charAt(0);
		 in.nextLine();
		 
		 int thick = (int) Math.round(n * 0.2);
		 int thick2 = 2 * thick;
		 
		 /* Create & fill toothed array */
		 arr = new char[n][];
		 for (int i = 0; i < thick; i++)
		 {
			 arr[i] = new char[n];
			 fillLine(arr[i], 0, n, filler);
			 arr[n-i-1] = new char[n];
			 fillLine(arr[n-i-1], 0, n, filler);
		 }
		 for (int i = thick; i < thick + (n - thick2); i++)
		 {
			 arr[i] = new char[thick2];
			 fillLine(arr[i], 0, thick2, filler);
		 }
		 /* Output array */
		 for (int row = 0; row < n; row++)
		 {
			 if (row < thick || row >= n - thick)
			 {
				 for (int col = 0; col < n; col++)
				 {
					 System.out.print(arr[row][col]);
					 fileOut.print(arr[row][col]);
				 }
			 }
			 else
			 {
				 int j = 0;
				 for (int col = 0; col < n; col++)
				 {
					 if ((col < thick || col >= n - thick))
					 {
						 System.out.print(arr[row][j]);
						 fileOut.print(arr[row][j]);
						 j++;
					 }
					 else
					 {
						 System.out.print(" ");
						 fileOut.print(" ");
					 }
				 }
			 }
			 System.out.print("\n");
			 fileOut.print("\n");
		 }
		 fileOut.flush();
		 fileOut.close();
		 in.close();
	}
	/**
	 * This method is used for filling array with specified character
	 * @param arr  Array
	 * @param from  Index from
	 * @param n  Chunk size
	 * @param filler  Character
	 */
	public static void fillLine(char[] arr, int from, int n, char filler)
	{
		 for (int i = from; i < n; i++)
			 arr[i] = filler;
	}
}
