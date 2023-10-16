/**
 * 
 */
package ki304.rybka.lab5;

/**
 * Class Equation implements equation y = (x - 4) / sin(3 * x - 1)
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class Equation 
{
    /**
     * Calculates y = (x - 4) / sin(3 * x - 1)
     * @param x Angle in radians
     * @throws CalcException
     */
	public double calc(double x) throws CalcException
	{
		double y = 0, denominator = 0;
        try 
        {
        	denominator = Math.sin(3 * x - 1);
            y = (x - 4) / denominator;
            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY)
                throw new ArithmeticException();
        } 
        catch (ArithmeticException ex) 
        {
            if (denominator == 0)
                throw new CalcException("Division by zero!");
            else
                throw new CalcException("Unknown");
        }
		return y;
	}
}
