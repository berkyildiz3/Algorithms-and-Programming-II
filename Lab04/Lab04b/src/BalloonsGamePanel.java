import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

import shapes.ShapeContainer;

/**
 * This class create balloon game panel
 * @author BERKYILDIZ
 * 28.03.2017
 */
public class BalloonsGamePanel extends JPanel implements MouseListener, ActionListener{

	//properties
	int x, y, radius;
	ShapeContainer baloons;
	Random generator;
	Baloon[] baloons1;
	Baloon a;
	
	//timer
	Timer time = new Timer(90, this);

	/**
	 * constructor for the balloons game
	 */
	public BalloonsGamePanel(){
		super();
		setBackground(Color.YELLOW );
		addMouseListener(this);
		baloons1 = new Baloon[25];
		generator = new Random();
		time.start();

		//create 25 balloons in random positions on the panel
		for(int i=0; i < 25; i++)
		{
			a = new Baloon(generator.nextInt(640), generator.nextInt(480), 25);
			baloons1[i] = a;
		}
	}
	
	/**
	 * draw 25 circles
	 */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i=0; i < 25; i++)
		{
			baloons1[i].draw(g);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {


	}

	/**
	 * control the events when mouse pressed by user
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		for(int i=0; i < 25; i++)
		{
			//if user click inside the circle, that circle disappear
			if((e.getX() < baloons1[i].getX() + radius) || (e.getY() < baloons1[i].getY() + radius))
			{
				Baloon b = new Baloon(0,0,0);
				baloons1[i] = b;
				
			}
		}
		//turn pressed circles to selected
		baloons.selectAllAt(e.getX(),e.getY());

	}
	
	/**
	 * control the events with timer
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//increase the radius of circles
		for(int i=0; i < 25; i++)
		{
			baloons1[i].grow();		
		}
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
