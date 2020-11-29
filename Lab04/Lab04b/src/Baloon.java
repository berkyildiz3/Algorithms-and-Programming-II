import java.awt.Graphics;
import java.util.Random;

import shapes.Circle;
import shapes.Drawable;

/**
 * This class includes the properties of balloon.
 * @author BERKYILDIZ
 *
 */
public class Baloon extends Circle implements Drawable {

	//properties
	int x, y;
	int radius = 25;
	
	//random generator
	Random gnr = new Random();

	/**
	 * constructor for a baloon
	 * @param x position on x-axis
	 * @param y position on y-axis
	 * @param radius radius of the baloon
	 */
	public Baloon(int x, int y, int radius) {
		
		super(radius);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	/**
	 * draw balloon
	 */
	@Override
	public void draw(Graphics g) {
		g.drawOval(x, y, radius, radius);		
	}

	/**
	 * increase the radius of balloon until the max size.
	 */
	public void grow(){

		radius = radius + 4;
		x = x - 2;
		y = y - 2;
		if(radius % 125 == 0)
		{
			radius = 25;
			x = gnr.nextInt(640);
			y = gnr.nextInt(480);
		}
	}
	
	/**
	 * get position on x-axis
	 * @return position on x-axis
	 */
	public int getX()
	{
		return x;
	}
	
	/**
	 * get position on y-axis
	 * @return position on y-axis
	 */
	public int getY()
	{
		return y;
	}
	
	/**
	 * @return radius of balloon
	 */
	public int getRadius()
	{
		return radius;
	}

}
