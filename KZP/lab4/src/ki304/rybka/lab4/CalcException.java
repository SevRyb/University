/**
 * 
 */
package ki304.rybka.lab4;

/**
 * Class CalcException implements calculation exception
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class CalcException extends ArithmeticException
{
	/**
	 * Constructor of CalcException
	 */
	public CalcException() {}
	/**
	 * Constructor of CalcException
	 */
    public CalcException(String cause)
    {
        super(cause);
    }
}
