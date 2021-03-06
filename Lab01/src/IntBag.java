import java.util.ArrayList;
/**
 * This program allows a variable sized collection of integer values to be stored.
 */

/**
 * @author BERKYILDIZ
 * 21.02.2017
 */
public class IntBag {

	//properties
	static int[] bag;
	static int valid;
	ArrayList<Integer> locations;

	//constructors
	public IntBag()
	{
		bag = new int[100];
	}

	public IntBag(int maxNumber)
	{
		bag = new int[maxNumber];
	}

	//methods


	/**
	 * add numbers in to array starting from beginning.
	 * @param number number that is going to be added in to the array.
	 */
	public void add(int number)
	{
		bag[valid]=number;
		valid++;
	}

	/**
	 * add a specified element into a specified index.
	 * @param number number which is going to be inserted
	 * @param i index
	 */
	public void add (int number, int i)
	{
		for(int k=bag.length-1; k > i ; k--)
		{
			bag[k] = bag[k-1];			
		}
		bag[i] = number;
		valid++;
	}

	/**
	 * removes the element from specified index
	 * @param i index
	 */
	public void remove(int i)
	{
		for(int k = i-1; k < bag.length-1; k++)
		{
			bag[k] = bag[k+1];
		}
	}
	
	
	/**
	 * Check if a number is included or not
	 * @param value number that is going to be look for
	 * @return is number included or not
	 */
	public boolean contains (int value)
	{
		for(int i=0; i < bag.length; i++)
		{
			if(bag[i]==value)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * String representation of the array
	 */
	public String toString()
	{
		String output = "[ " ;
		for ( int i = 0; i < bag.length; i++ )
		{
			output = output + bag[i] + ",";
		}    
		output = output + " ]" ;
		return output;
	}
	
	/**
	 * 
	 * @return size of the array
	 */
	public static int size()
	{
		return valid;
	}
	
	/**
	 * get the value of specified index
	 * @param i index
	 * @return value of the index
	 */
	public static int get(int i)
	{
		return bag[i];
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public ArrayList<Integer> findAll(int value)
	{
		for(int i=0; i < bag.length-1; i++)
		{
			if(value == bag[i])
			{
				locations.add(i);
			}
		}
		return locations;
	}
}
