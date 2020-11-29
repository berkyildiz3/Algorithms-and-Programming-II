package shapes;
import java.util.Scanner;
/**
 * Tester class for the Shape class. Present a menu to user for using the functions of classes.
 * @author BERKYILDIZ
 * 20.03.2017
 */
public class ShapeTester {


	public static void main(String[] args) {

		//properties
		int sentinel = 0;
		int selection;
		int x;
		int y;
		int width;
		int height;
		int side;
		int radius;
		ShapeContainer shapes = new ShapeContainer();
		String shapeType;

		Scanner in = new Scanner(System.in);

		do
		{	
			//menu options
			System.out.println("(1) Create empty set of shapes.");
			System.out.println("(2) Add shape.");
			System.out.println("(3) Compute total surface area.");
			System.out.println("(4) Print out information about shapes.");
			System.out.println("(5) Find the first shape contains given x and y.");
			System.out.println("(6) Remove selected shapes.");
			System.out.println("(7) Quit");

			//ask for option to user
			System.out.print("Please enter a menu option: ");
			selection = in.nextInt();

			//create new empty list
			if(selection == 1)
			{
				shapes = new ShapeContainer();
			}
			//add shape in to the list
			else if (selection == 2)
			{
				//ask for the type of the shape to user
				System.out.print("Enter 'R' for Rectangle, 'S' for Square, 'C' for Circle");
				shapeType = in.next();

				//add rectangle to the list
				if(shapeType.equals("R"))
				{
					//ask for width
					System.out.print("Enter width: ");
					width = in.nextInt();
					//ask for height
					System.out.print("Enter height: ");
					height = in.nextInt();
					//create rectangle object and add to the list
					Rectangle r = new Rectangle(width, height);
					shapes.add(r);

					System.out.println("Enter location on x-axis: ");
					x = in.nextInt();

					System.out.println("Enter location on y-axis: ");
					y = in.nextInt();

					r.setLocation(x, y);

				}
				//add square to the shape
				else if(shapeType.equals("S"))
				{
					//ask for side length
					System.out.print("Enter the length of a side: ");
					side = in.nextInt();
					//create square object and add to the list
					Square s = new Square(side);
					shapes.add(s);

					System.out.println("Enter location on x-axis: ");
					x = in.nextInt();

					System.out.println("Enter location on y-axis: ");
					y = in.nextInt();

					s.setLocation(x, y);
				}
				//add circle in to the list
				else if(shapeType.equals("C"))
				{
					//ask for radius
					System.out.print("Enter the radius: ");
					radius = in.nextInt();
					//create circle object and add in to the list
					Circle c = new Circle(radius);
					shapes.add(c);

					System.out.println("Enter location on x-axis: ");
					x = in.nextInt();

					System.out.println("Enter location on y-axis: ");
					y = in.nextInt();

					c.setLocation(x, y);
				}
			}
			//print the total surface area of the all shapes in the list
			else if (selection == 3)
			{
				System.out.println(shapes.getArea());
			}
			//print the information of all shapes
			else if (selection == 4)
			{
				System.out.println(shapes.toString());
			}
			//find the first shape which contain given x and y position
			else if (selection == 5)
			{
				//ask for x value
				System.out.print("Enter x value: ");
				x = in.nextInt();
				//ask for y value
				System.out.print("Enter y value: ");
				y = in.nextInt();

				//look for contain or not
				for(int i=0; i < shapes.getSize(); i++)
				{
					if(shapes.getShape(i) instanceof Rectangle)
					{
						System.out.println(((Rectangle) shapes.getShape(i)).contains(x, y));
						((Rectangle) ((Rectangle) shapes.getShape(i)).contains(x, y)).setSelected(true);
					}

					else if(shapes.getShape(i) instanceof Circle)
					{
						System.out.println(((Circle) shapes.getShape(i)).contains(x, y));
						((Circle) ((Circle) shapes.getShape(i)).contains(x, y)).setSelected(true);					
					}

					else if(shapes.getShape(i) instanceof Square)
					{
						System.out.println(((Square) shapes.getShape(i)).contains(x, y));
						((Square) ((Square) shapes.getShape(i)).contains(x, y)).setSelected(true);
					}
				}
			}
			//remove all selected shapes from the list
			else if (selection == 6)
			{
				for (int i=0; i < shapes.getSize(); i++)
				{
					//remove selected rectangles
					if(((Rectangle)shapes.getShape(i)).getSelected() == true)
					{
						shapes.remove(i);
					}
					//remove selected circles
					if(((Circle)shapes.getShape(i)).getSelected() == true)
					{
						shapes.remove(i);
					}
					//remove selected squares
					if(((Square)shapes.getShape(i)).getSelected() == true)
					{
						shapes.remove(i);
					}
				}
			}
			//quit the program
			else if (selection == 7)
			{
				sentinel = -1;
			}
		}while(sentinel != -1);
	}
}
