
import cs101.sosgame.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 * This class create the canvas for the SOSGame.
 * @author BERKYILDIZ
 * 04.04.2017
 */
public class SOSCanvas extends JPanel {

    //properties
    int size, row, column;
    ArrayList<Rectangle> panels;
    SOS game;
    MouseListener e;
    
    /**
     * Constructor of the canvas
     * @param game instance of SOS class
     * @param e event
     */
    public SOSCanvas(SOS game, MouseListener e) {
        this.game = game;
        this.e = e;
        panels = new ArrayList<Rectangle>((row * column));
        size = game.getDimension();
        setPreferredSize(new Dimension(500, 500));

    }

    /**
     * Drawing method of the canvas
     * @param g graphics variable
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        row = 0;
        column = 0;
        size = game.getDimension();

        int a = (int) 500 / size;

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                g.drawRect(row, column, a, a);
                row += a;

                String s = "" + game.getCellContents(i, k);
                g.drawString(s, row - (a / 2), column + (a / 2));
            }
            column += a;
            row = 0;
        }
    }
}