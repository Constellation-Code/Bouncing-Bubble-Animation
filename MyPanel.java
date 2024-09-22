import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{
    
    /**initialise variables
     * 
     * This is  where all the initial variables for the MyPanel class will be stored. 
     * This is for the operations of the panel to function correctly.
    **/
    final int panelWidth = 500;
    final int panelHeight = 500;
    Image bubble;
    Image backgroundImage;
    Timer timer;
    int counter = 0;
    int xVelocity = 3;
    int yVelocity = 2;
    int x = 0;  // starting x position
    int y = 0;  // starting y position

    // constructor
    MyPanel() {
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setBackground(Color.black);
        bubble = new ImageIcon("bubble.png").getImage();
        backgroundImage = new ImageIcon("UnderWater.png").getImage();
        timer = new Timer(5, this);
        timer.start();
    }


    public void paint(Graphics g) {

        super.paint(g); // paint background from superclass
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(bubble, x, y, null);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        // check x values
        if (x >= panelWidth - bubble.getWidth(null) || x < 0)    // check border collision for x
        {
            xVelocity = xVelocity * -1;
            counter += 1;
        }
        x = x + xVelocity;  // update position

        // check y values
        if (y >= panelWidth - bubble.getWidth(null) || y < 0)    // check border collision for x
        {
            yVelocity = yVelocity * -1;
            counter += 1;
        }
        y = y + yVelocity;  // update position

        // repaint method - needed to paint image constantly (update image)
        repaint();
        
    }
    
}