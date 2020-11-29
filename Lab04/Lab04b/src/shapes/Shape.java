package shapes;
import shapes.Locatable;

/**
 * This class is the super class of shapes and include setters and getters for location methods
 * @author Berk Yýldýz
 * 20.03.2017
 */
public abstract class Shape implements Locatable{

	//Properties
	int x_location;
	int y_location;

	/**
	 * abstract method for getting the surface area of shapes
	 * @return surface areas of the shapes rectangle, square and circle
	 */
	public abstract double getArea();

	/**
	 * set the location on x and y axis of a shape
	 */
	@Override
	public void setLocation(int x, int y) 
	{
		x_location = x;
		y_location = y;
	}

	/**
	 * get the x location of the shape
	 * @return position on x-axis
	 */
	@Override
	public int getX() 
	{
		return x_location;
	}

	/**
	 * get the y location of the shape
	 * @return position y-axis
	 */
	@Override
	public int getY() 
	{
		return y_location;
	}
}
