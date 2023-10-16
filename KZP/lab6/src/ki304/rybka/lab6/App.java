package ki304.rybka.lab6;

import java.io.FileNotFoundException;

/**
 * Implementation of Lab6
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class App 
{
	/**
	 * Entry point of the application
	 * @param args  Not used
	 */
	public static void main(String[] args)
	{
		Basket basket = new Basket();
		
		Apple a = new Apple("red", 1000);
		basket.addObject(a);
		basket.removeObject(0);
		
		Apple a1 = new Apple("green", 50.6);
		basket.addObject(a1);
		
		Apple a2 = new Apple("yellow", 100.81);
		basket.addObject(a2);
		
		Bottle b = new Bottle("transparent", 1000, 1);
		basket.addObject(b);
		
		Bottle b1 = new Bottle(b);
		b1.setColor("black");
		b1.setMass(500);
		basket.addObject(b1);
		
		basket.showObjects();
		
		IObject o = basket.maxMassObject();
		System.out.println("The heaviest object: ");
		o.showInfo();
	}
}
