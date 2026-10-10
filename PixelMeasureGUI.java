//This class holds the Base of the GUI Elements in the project. This will be used to let the user pick which measurement method they want to use. 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("unused")

public class PixelMeasureGUI extends JWindow
{
    Dimension WindowSize = Toolkit.getDefaultToolkit().getScreenSize();
    JButton reference = new JButton("Reference");
    JButton point = new JButton("Two Point");
    JButton exit = new JButton("Quit");
    public PixelMeasureGUI()
    {
     //housekeeping
     setLayout(new FlowLayout());
     setSize(350,40);
     setBackground(Color.lightGray);
     point.setBackground(Color.gray);
     exit.setBackground(Color.darkGray);
     exit.setForeground(Color.white);

     setLocation((WindowSize.width)/2, WindowSize.height);
     //check if the device can check the stuff

     //Manages the ruler (See TODO)
     reference.addActionListener((ActionEvent e) -> {this.reference();});
     
     //manages the point selections
     point.addActionListener((ActionEvent e) -> {this.point();});
     
     //Manages the exit button to quit the program
     exit.addActionListener((ActionEvent e) -> {System.exit(0);});


     //adds the elements to the frame
     add(point);
     add(reference);
     add(exit);

     setVisible(true);
     }


     public void reference()
     {
          PixelRef Pr = new PixelRef();
     }

     public void point()
     {
          PixelTwoPoint ptp = new PixelTwoPoint();
     }
     public static void main(String args[])
     {
          PixelMeasureGUI pm = new PixelMeasureGUI();
     }
}
