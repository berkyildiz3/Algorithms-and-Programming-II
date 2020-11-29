/**
 * This class is the sub-class of Shape which include the properties and methods of circle.
 * @author BERKYILDIZ
 * 20.03.2017
 */
public class Circle extends Shape implements Selectable {
	
	//properties
	int radius;
	boolean selected;
	ShapeContainer shapeList;
	
	//constructors
	
	/**
	 * Constructor for circle
	 * @param radius radius of the circle
	 */
	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	//methods
	
	/**
	 * compute and get the area of the circle
	 * @return surface area of circle
	 */
	@Override
	public double getArea() 
	{
		return Math.PI * radius * radius;
	}
	
	/**
	 * @return string represantion of properties of circle
	 */
	public String toString()
	{
		return " Circle - radius : " + radius + " " + selected;
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
			if(((Math.pow(shapeList.getShape(i).getX(),2) <= Math.pow(radius,2)- Math.pow(shapeList.getShape(i).getY(), 2)) && ((Math.pow(shapeList.getShape(i).getY(),2) <= Math.pow(radius,2)- Math.pow(shapeList.getShape(i).getX(), 2)))))
			{
				selected = true;
				return shapeList.getShape(i);
			}
		}
		return null;
	}
}
