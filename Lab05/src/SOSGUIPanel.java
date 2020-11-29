
import cs101.sosgame.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 * This class create GUI Panel for the SOSGame.
 *
 * @author BERKYILDIZ 04.04.2017
 */
public class SOSGUIPanel extends JPanel {

    //properties
    String player1, player2, winner;
    JLabel firstPlayer, secondPlayer;
    JRadioButton button1, button2;
    MouseListener e;
    char click;
    SOS game;

    /**
     * Constructor for the GUI Panel.
     *
     * @param game instance of SOS class.
     * @param player1 name of player 1
     * @param player2 name of player 2
     */
    public SOSGUIPanel(SOS game, String player1, String player2) {
        this.game = game;
        this.player1 = player1;
        this.player2 = player2;

        //create instance of canvas
        SOSCanvas canvas = new SOSCanvas(game, e);

        //create a panel
        JPanel panel = new JPanel();

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //create players with their names and scores
        firstPlayer = new JLabel(firstPlayer + " " + game.getPlayerScore1());
        secondPlayer = new JLabel(secondPlayer + " " + game.getPlayerScore2());

        firstPlayer.setOpaque(true);
        secondPlayer.setOpaque(true);

        firstPlayer.setBackground(Color.YELLOW);
        secondPlayer.setBackground(Color.WHITE);

        //create buttons
        button1 = new JRadioButton("S");
        button2 = new JRadioButton("O");

        //create a button group
        ButtonGroup buttons = new ButtonGroup();
        buttons.add(button1);
        buttons.add(button2);

        //action of the button
        ButtonListener listenerButton = new ButtonListener();
        button1.addActionListener(listenerButton);
        button2.addActionListener(listenerButton);

        //insert the players and buttons in to the panel
        panel.add(firstPlayer);
        panel.add(secondPlayer);
        panel.add(button1);
        panel.add(button2);

        //insert canvas and panel into the frame
        add(canvas);
        add(panel);
        //add mouse listener
        e = new MouseListener1();
        addMouseListener(e);
    }

    //Inner class for mouse listener
    public class MouseListener1 extends MouseAdapter {

        /**
         * method for taking actions when the mouse has pressed.
         *
         * @param e event
         */
        @Override
        public void mousePressed(MouseEvent e) {

            //define locations of y and x and handle the press event
            int y = e.getX() / (500 / game.getDimension()) + 1;
            int x = e.getY() / (500 / game.getDimension()) + 1;

            //set the background colors of the player names
            if (game.getTurn() == 1) {
                firstPlayer.setBackground(Color.YELLOW);
                secondPlayer.setBackground(Color.WHITE);
            }
            if (game.getTurn() == 2) {
                firstPlayer.setBackground(Color.WHITE);
                secondPlayer.setBackground(Color.YELLOW);
            }

            //handle click
            game.play(click, x, y);

            //update score on the panel
            firstPlayer.setText(player1 + " " + game.getPlayerScore1());
            secondPlayer.setText(player2 + " " + game.getPlayerScore2());
            repaint();

            //decide the winner according to scores
            if (game.isGameOver()) {
                if (game.getPlayerScore1() > game.getPlayerScore2()) {
                    winner = player1 + " wins!";
                } else if (game.getPlayerScore2() > game.getPlayerScore1()) {
                    winner = player2 + " wins!";
                } else {
                    winner = "Draw";
                }

                JOptionPane.showMessageDialog(null, winner);
            }
        }
    }

    //Inner class for button actions
    public class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Object event = e.getSource();
            if (event == button1) {
                click = 's';
            } else if (event == button2) {
                click = 'o';
            }
        }
    }
}
