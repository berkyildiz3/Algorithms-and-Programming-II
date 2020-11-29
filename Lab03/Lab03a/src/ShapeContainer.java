import java.util.ArrayList;
/**
 * This class hold the list of the shapes.
 * @author Berk Yýldýz
 * 20.03.2017
 */
public class ShapeContainer  {
	
	//properties
	ArrayList<Shape> shapeList = new ArrayList<Shape>();
	double surfaceArea;

	//methods
	
	/**
	 * add shape in to the list
	 * @param s the shape which is going to be added
	 */
	public void add (Shape s)
	{
		shapeList.add(s);
	}
	
	/**
	 * get the total surface are of the shapes which are listed
	 * @return total surface area
	 */
	public double getArea()
	{
		for(int i=0; i < shapeList.size(); i++)
		{
			surfaceArea += shapeList.get(i).getArea(); 
		}
		return surfaceArea;
	}

	/**
	 * @return string representation of listed shapes
	 */
	public String toString()
	{
		String output = "[ ";
		for(int i=0; i < shapeList.size(); i++)
		{
			output += shapeList.get(i) + ",";
		}

		output += " ]";
		return output;
	}

	/**
	 * get the specified shape from the list
	 * @param i index 
	 * @return specified shape
	 */
	public Shape getShape(int i)
	{
		return shapeList.get(i);
	}

	/**
	 * get number of elements of the list  
	 * @return number of elements
	 */
	public int getSize()
	{
		return shapeList.size();
	}
	
	/**
	 * remove specified element from the list
	 * @param i index
	 */
	public void remove(int i)
	{
		shapeList.remove(i);
	}
}
