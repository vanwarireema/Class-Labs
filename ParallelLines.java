import java.awt.*;
import javax.swing.*;

/**
 * This class creates the parallel lines illusion by creating lines and squares
 * that offset each other line by a certain number
 * Additionally, the class uses a certain number (the offset) that allws each line
 * to differ from each other to create the illusion
 * A nested for-loop is used in order to quickly fill in the grid squares
 * the g.fillrects uses inputs that adds a certain number to the x value for each line
 * then adds a number to the variable z, to again offset the value
 * 
 * 
 * @author Reema Vanwari
 * @version 9/29/23
 * 
 *          Period - 1
 *          Assignment - A12.6 - ParallelLines
 * 
 *          Sources - None
 */
public class ParallelLines extends JPanel {
  private int x, lineX, lineY, offSet;

  public void paintComponent(Graphics g) {
    super.paintComponent(g); // Call JPanel's paintComponent method
                             // to paint the background

    int width = getWidth();
    int height = getHeight();

    drawIllusion(g, width, height);
  }

  /**
   * Draw illusion creates the lines and fills in the squares of each rectagle
   * 
   * @param g
   * @param width
   * @param height
   * @param size
   */
  public void drawIllusion(Graphics g, int width, int height) {
    for (int row = 0; row < 9; row++) {

      g.drawLine(lineX, lineY + offSet, 900, 0 + offSet);

      offSet += 45;
      // calculate the start of the row of squares
      // calculate and add a horizontal offset

      for (int col = 0; col < 7; col++) {

        int y = 45;
        int z = 45;
        g.fillRect(x, z - 45, y, y);

        g.fillRect(x + 25, z, y, y);

        g.fillRect(x + 45, z * 2, y, y);

        g.fillRect(x +25, z * 3, y, y);

        g.fillRect(x, z * 4, y, y);

        g.fillRect(x + 25, z * 5, y, y);

        g.fillRect(x + 45, z * 6, y, y);

        g.fillRect(x + 25, z * 7, y, y);

        //g.fillRect(x + 0, z * 8, y, y);

        z = z + 90;
        x = x + 90;

        // draw the square
        // calculate and position for the next square
      }

    }
  }

  public static void main(String[] args) {
    JFrame w = new JFrame("ParallelLines");
    w.setBounds(100, 100, 640, 480);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ParallelLines panel = new ParallelLines();
    panel.setBackground(Color.WHITE);
    Container c = w.getContentPane();
    c.add(panel);
    w.setResizable(true);
    w.setVisible(true);
  }
}
