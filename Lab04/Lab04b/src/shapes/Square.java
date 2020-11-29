package shapes;

/**
 * This class is the sub-class of Rectangle and include the properties of square
 * @author Berk Yýldýz
 * 20.03.2017
 */
public class Square extends Rectangle implements Selectable {

	/**
	 * Constructor for square
	 * @param side length of the side
	 */
	public Square(int side) 
	{
		super(side);
		height = side;
		width = side;
	}
	
	/**
	 * @return string representation of properties of a square.
	 */
	public String toString()
	{
		return " Square - side length: " + side + " " + selected;
	}
}
