import java.util.Iterator;

/**
 * Iterator class for IntBag.
 * @author BERKYILDIZ
 * 21.03.2017
 */
public class IntBagIterator implements Iterator {

	//properties
	IntBag aBag = new IntBag(100);
	int index = 0;

	/**
	 * Constructor for IntBagIterator
	 * @param aBag intbag instance which is going to be iterated
	 */
	public IntBagIterator(IntBag aBag)
	{
		this.aBag = aBag;
	}
	
	/**
	 * check if there is a next element
	 * @return true if there is a next element
	 */
	public boolean hasNext()
	{
		if(index < aBag.size())
		{
			return true;
		}
		return false;
	}

	/**
	 * turns the integer types into object in an intbag instance
	 * @return object type elements
	 */
	@Override
	public Object next() {
		
		Integer wrap = new Integer(aBag.get(index));
		index++;
		return wrap;
	}


}







