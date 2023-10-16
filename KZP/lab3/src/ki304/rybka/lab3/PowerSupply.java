/**
 * 
 */
package ki304.rybka.lab3;

/**
 * Class PowerSupply implements power supply
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class PowerSupply 
{
	private boolean isOn = false;
	/**
	 * Constructor of PowerSupply
	 */
	public PowerSupply() 
	{
		isOn = false;
	}
	/**
	 * Turn on
	 * @param on Is on
	 */
	public void turnOn(boolean on)
	{
		isOn = on;
	}
	/**
	 * If is turned on
	 * @return Is turned on
	 */
	public boolean isOn()
	{
		return isOn;
	}
}
