package ki304.rybka.lab6;

/**
 * Interface IObject describes object
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public interface IObject extends Comparable<IObject> 
{
	/**
	 * Sets color
	 * @param _color Color
	 */
	void setColor(String _color);
	/**
	 * Gets object color
	 * @return Object color
	 */
	String getColor();
	/**
	 * Sets mass
	 * @param _mass Mass
	 */
	void setMass(double _mass);
	/**
	 * Gets object mass
	 * @return Object mass
	 */
	double getMass();
	/**
	 * Shows object info
	 */
	void showInfo();
}
