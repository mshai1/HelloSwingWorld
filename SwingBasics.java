import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

public class SwingBasics implements Runnable{

        /**
           The run method to set up the graphical user interface
    
        */
        @Override
        public void run() {
        
        // set up the GUI "look and feel" which should match
        // the OS on which we are running
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        // create a JFrame in which we will build our very
        // tiny GUI, and give the window a name
        JFrame frame = new JFrame("SwingBasics");
        
        // tell the JFrame that when someone closes the
        // window, the application should terminate
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setPreferredSize(new Dimension(500,500));
        
        // create a JLabel containing our message, and add
        // it to our JFrame
        JLabel label = new JLabel("Swing is Fun");

        JPanel jpanel = new JPanel();
        JLabel label1 = new JLabel("Swing is Amazing");
        JLabel label2 = new JLabel("Swing is Double fun");

        frame.add(jpanel);
        jpanel.add(label);
        jpanel.add(label1);
        jpanel.add(label2);
        

    

     
        label.setForeground(Color.RED);
        label1.setForeground(Color.YELLOW);
        label2.setForeground(Color.BLUE);
        
        // display the window we've created
        frame.pack();
        frame.setVisible(true);
        }

        public static void main(String args[]) {

            // The main method is responsible for creating a thread (more
            // about those later) that will construct and show the graphical
            // user interface.
            javax.swing.SwingUtilities.invokeLater(new SwingBasics());
            }
    
}
