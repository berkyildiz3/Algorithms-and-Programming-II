
import cs101.sosgame.*;
import javax.swing.*;
import java.awt.*;

/**
 * Tester for SOS Game
 *
 * @author BERKYILDIZ
 */
public class SOSGameTester {

    public static void main(String[] args) {
        
        //instances 
        JFrame frame = new JFrame("MySOSGame");
        SOS sosGame = new SOS(3);
        SOSGUIPanel panelGame = new SOSGUIPanel(sosGame, "Ahmet", "Mehmet");
        JPanel panel = new JPanel();

        panel.add(panelGame);
        frame.getContentPane().add(panel);

        frame.setPreferredSize(new Dimension(1000, 700));
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
