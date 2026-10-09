//This class holds the Base of the GUI Elements in the project. This will be used to let the user pick which measurement method they want to use. 
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class PixelMeasureGUI extends JWindow
{
    JButton ruler = new JButton("Ruler");
    JButton point = new JButton("Two Point");
    JButton exit = new JButton("Quit");
    public PixelMeasureGUI()
    {
     setSize(250,40);
     //housekeeping
     setLayout(new FlowLayout());
     
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


     public int ruler()
     {
          System.out.println("yo");
          return 0;
     }

     public int point()
     {
          System.out.println("gurt");
          return 0;
     }
     public static void main(String args[])
     {
          PixelMeasureGUI pm = new PixelMeasureGUI();
     }
}
