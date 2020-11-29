package shapes;
/**
 * This class is the sub-class of Shape which include the properties and methods of rectangle.
 * @author Berk Yýldýz	
 * 20.03.2017
 */
public class Rectangle extends Shape implements Selectable {

	//Properties
	int width;
	int height;
	int side;
	ShapeContainer shapeList;
	boolean selected;

	//Constructors 

	/**
	 * Constructor for rectangle
	 * @param width width of the rectangle
	 * @param height height of the rectangle
	 */
	public Rectangle (int width, int height)
	{
		this.width = width;
		this.height = height;
	}

	/**
	 * Constructor for square
	 * @param side side length of the square
	 */
	public Rectangle (int side)
	{
		this.side = side;
	}

	//Methods

	/**
	 * compute and get the area of rectangle and square
	 * @return surface area
	 */
	@Override
	public double getArea() 
	{
		return width * height;
	}

	/**
	 * @return the properties of rectangle in String type
	 */
	public String toString()
	{
		return " Rectangle - width: " + width + " height: " + height + " " + selected;
	}

	/**
	 * Check is the shape is selected or not
	 * @return true if the shape is selected, false if the shape is not selected
	 */
	@Override
	public boolean getSelected() 
	{
		if(selected)
		{
			return true;
		}
		return false;
	}

	/**
	 * Set a shape selected or not selected
	 * @param a if a is true, set the shape selected, if not set the shape not-selected
	 */
	@Override
	public void setSelected(boolean a) 
	{
		if(a == true)
		{
			selected = true;
		}
		else if(a == false)
		{
			selected = false;
		}
	}

	/**
	 * Check that is the shape containing given x and y position
	 * @param position on x axis to check
	 * @param position on y axis to check
	 * @return if the shape contains given x-y position, then return the shape
	 */
	@Override
	public Shape contains(int x, int y) 
	{
		for(int i=0; i < shapeList.getSize(); i++)
		{
			if(shapeList.getShape(i).getX() <= x + width ){
				if(shapeList.getShape(i).getX() >= x - width){ 
					if(shapeList.getShape(i).getY() <= y + height){
						if (shapeList.getShape(i).getY() >= y - height)
						{
							selected = true;
							return shapeList.getShape(i);
						}
					}
				}
			}
		}
		return null;
	}
}
