package shapes;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * This class hold the list of the shapes.
 * @author Berk Yýldýz
 * 20.03.2017
 */
public class ShapeContainer implements Iterable {
	
	//properties
	ArrayList<Shape> shapeList = new ArrayList<Shape>();
	double surfaceArea;
	ShapeContainer a;
	Iterator x;

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
	 * remove specified element from the list
	 * @param i index
	 */
	public void remove(int i)
	{
		shapeList.remove(i);
	}
	/**
	 * Iterator for shapecontainer object
	 */
	@Override
	public Iterator iterator() {
		
		x = shapeList.iterator();
		return x;
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
	 * remove the all selected objects from the shape list.
	 */
	public void removeSelected()
	{
		for(int i=0; i <= a.getSize(); i++)
		{
			//remove rectangles
			if(a.getShape(i) instanceof Rectangle)
			{
				if(((Rectangle)a.getShape(i)).getSelected() == true)
				{
					a.remove(i);;
				}		
			}
			//remove circles
			else if(a.getShape(i) instanceof Circle)
			{
				if(((Circle)a.getShape(i)).getSelected() == true)
				{
					a.remove(i);
				}		
			}			
		}	
	}
	/**
	 * select all objects which contain given x, y
	 * @param x position on x-axis to be look for
	 * @param y	position on y-axis to be look for
	 * @return number of selected objects
	 */
	public int selectAllAt( int x, int y)
	{
		int count = 0;
		for(int i=0; i <= a.getSize(); i++)
		{
			if(a.getShape(i) instanceof Rectangle)
			{
				//count rectangles
				if(((Rectangle)a.getShape(i)).getSelected() == true)
				{
					count++;
				}		
			}
			//count circles
			else if(a.getShape(i) instanceof Circle)
			{
				if(((Circle)a.getShape(i)).getSelected() == true)
				{
					count++;
				}		
			}			
		}
		return count;
	}
}
