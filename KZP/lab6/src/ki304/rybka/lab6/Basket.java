package ki304.rybka.lab6;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class Basket implements basket
 * @author Severyn Rybka
 * @version 1.0
 * @since version 1.0
 */
public class Basket<T extends IObject> 
{
	/**
	 * List of objects
	 */
	private ArrayList<T> list;
	/**
	 * Constructor
	 */
	public Basket() 
	{
		list = new ArrayList<T>();
	}
	/**
	 * Adds object to list
	 * @param object Object
	 */
    public void addObject(T object)
    {
    	list.add(object);
        System.out.print("Added object: ");
        object.showInfo();
    }
	/**
	 * Removes object from list
	 * @param i Object index
	 */
    public void removeObject(int i)
    {
    	if (i < list.size())
    	{
        	T object = list.get(i);
            System.out.print("Removed object: ");
            object.showInfo();
        	list.remove(i);
    	}
    }
	/**
	 * Finds heaviest object
	 * @return object Object with largest mass
	 */
	public T maxMassObject() 
	{
		if (list.isEmpty())
			return null;
		T object = list.getFirst();
		for (int i = 1; i < list.size(); i++)
		{
			if (object.compareTo(list.get(i)) < 0)
				object = list.get(i); 
		}
		return object;
	}
	/**
	 * Shows all objects in list
	 */
	public void showObjects()
	{
		System.out.println(list.size() + " objects in basket");
		for (T object : list)
		{
			object.showInfo();
		}
	}
}
