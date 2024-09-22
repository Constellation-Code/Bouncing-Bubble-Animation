//import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{

    MyPanel panel;

    MyFrame(){

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // auto close on exit
        this.add(panel);    // adds panel to frame, which allows painting on panel from frame
        this.pack();
        this.setLocationRelativeTo(null);   // allows the frame to appear in middle of screen
        this.setVisible(true);
    }
}