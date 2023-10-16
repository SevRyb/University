package ki304.rybka.lab6;

/**
 * Class Apple implements apple
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class Apple implements IObject
{
	private String color;
	private double mass = 0;
	/**
	 * Constructor
	 * @param _color Color
	 * @param _mass Mass
	 */
	public Apple(String _color, double _mass)
	{
		color = _color;
		mass = _mass;
	}
	/**
	 * Compares objects by mass
	 * @param object Object
	 */
    public int compareTo(IObject object) 
    {
    	Double _mass = mass;
        return _mass.compareTo(object.getMass());
    }
	/**
	 * Gets object mass
	 * @return Object mass
	 */
	@Override
	public double getMass()
	{
		return mass;
	}
	/**
	 * Sets mass
	 * @param _mass Mass
	 */
	@Override
	public void setMass(double _mass) 
	{
		mass = _mass;
	}
	/**
	 * Shows object info
	 */
	@Override
	public void showInfo() 
	{
		System.out.println("[Apple, " + color + ", " + mass + "g]");
	}
	/**
	 * Gets object color
	 * @return Object color
	 */
	@Override
	public String getColor() 
	{
		return color;
	}
	/**
	 * Sets color
	 * @param _color Color
	 */
	@Override
	public void setColor(String _color) 
	{
		color = _color;
	}
}
