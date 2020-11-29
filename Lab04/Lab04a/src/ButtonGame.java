import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * A button game that user tries to guess the place of the prize.
 * @author BERKYILDIZ
 * 28.03.2017
 */
public class ButtonGame extends JFrame           
{
	
	//instances
	JPanel panel[] = new JPanel[5];
	JButton button[] = new JButton[25];
	JLabel statusBar = new JLabel("Click buttons to find the prize!");     
	
	//properties
	public int numberOfAttempts = 0;
	public int prizeLocation = 1 + (int)(Math.random() * 25);

	/**
	 * constructor for button game
	 */
	public ButtonGame()
	{
		gameProperties();
	}
	
	/**
	 * include properties of the button game.
	 */
	public void gameProperties()
	{
		setTitle("Button Game");
		//create 25 buttons
		for (int i = 0 ; i < 25 ; i++)
		{
			button[i]= new JButton();  
		}      
		//create GridLayout
		setLayout(new GridLayout(5,1));
		add(statusBar);
		setVisible(true);

		//place panels in 5*5
		for(int row = 0; row < 5; row++)
		{
			add(panel[row] = new JPanel(new GridLayout(1,5)));
		}
		for(int row = 0; row < 5; row++)
		{
			for(int column = 0; column < 5; column++)
			{
				panel[row].add(button[5 * column + row]);

				button[5 * column + row].addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						//print message if user find the prize and show the number of attempts
						if(button[prizeLocation] == event.getSource())
						{
							statusBar.setText("Found the prize in " + numberOfAttempts + " attempts!");
							numberOfAttempts = 0;
						}
						//increase the number of attempts and warn user for trying again
						else
						{
							numberOfAttempts++;				
							statusBar.setText(" Try..  " + "Number of Attempts: " + numberOfAttempts); 
						}
					}
				});
			}
		}
		pack();
	}
	
	//run the game
	public static void main(String[] args) {

		new ButtonGame();
	}
}