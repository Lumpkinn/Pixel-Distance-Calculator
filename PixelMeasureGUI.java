//This class holds the Base of the GUI Elements in the project. This will be used to let the user pick which measurement method they want to use. 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("unused")

public class PixelMeasureGUI extends JWindow
{
    Dimension WindowSize = Toolkit.getDefaultToolkit().getScreenSize();
    JButton ruler = new JButton("Ruler");
    JButton point = new JButton("Two Point");
    JButton exit = new JButton("Quit");
    public PixelMeasureGUI()
    {
     setSize(250,40);
     //housekeeping
     setLayout(new FlowLayout());
     //Make sure that this gets the info f
     setLocation((WindowSize.width)/2, WindowSize.height);
     //check if the device can check the stuff

     //Manages the ruler
     ruler.addActionListener((ActionEvent e) -> {this.ruler();});
     
     //manages the point selections
     point.addActionListener((ActionEvent e) -> {this.point();});
     
     //Manages the exit button to quit the program
     exit.addActionListener((ActionEvent e) -> {System.exit(0);});


     //adds the elements to the frame
     add(ruler);
     add(point);
     add(exit);
     setVisible(true);
     }


     public void ruler()
     {
          System.out.println("yo");
     }

     public void point()
     {
          
          PixelTwoPoint ptp = new PixelTwoPoint();
          ptp = null;
          System.gc();
     }
     public static void main(String args[])
     {
          PixelMeasureGUI pm = new PixelMeasureGUI();
     }
}
