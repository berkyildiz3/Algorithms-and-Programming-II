import javax.swing.JFrame;

/**
 * Create a frame in 640*480 size.
 * @author BERKYILDIZ
 * 28.03.2017
 */
public class Lab04b {

	public static void main(String[] args) {
		
		//create frame
		JFrame frame = new JFrame();
		//set size
		frame.setSize(640, 480);
		//add game panel into frame
		frame.add(new BalloonsGamePanel());
		//make the frame visible
		frame.setVisible(true);
	}
}
