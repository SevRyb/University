package ki304.rybka.lab6;

/**
 * Class Bottle implements bottle
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class Bottle implements IObject
{
	private String color;
	private double mass = 0;
	private double volume = 0;
	/**
	 * Constructor
	 * @param _color Color
	 * @param _mass Mass
	 * @param _volume Volume
	 */
	public Bottle(String _color, double _mass, double _volume)
	{
		color = _color;
		mass = _mass;
		volume = _volume;
	}
	/**
	 * Copy constructor
	 * @param bottle Other bottle
	 */
	public Bottle(Bottle bottle)
	{
		color = bottle.getColor();
		mass = bottle.getMass();
		volume = bottle.getVolume();
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
		System.out.println("[Bottle, " + color + ", " + mass + "g, " + volume + "l]");
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
	/**
	 * Gets object volume
	 * @return Object color
	 */
	public double getVolume() 
	{
		return volume;
	}
	/**
	 * Sets color
	 * @param _volume Color
	 */
	public void setVolume(double _volume) 
	{
		volume = _volume;
	}
}
