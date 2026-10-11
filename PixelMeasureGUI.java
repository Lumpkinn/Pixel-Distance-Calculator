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
    JButton ruler = new JButton("Ruler");
    JButton Conversion = new JButton("Convert");

    public PixelMeasureGUI()
    {
     //housekeeping
     setLayout(new FlowLayout());
     setSize(480,40);
     setBackground(Color.lightGray);
     point.setBackground(Color.gray);
     exit.setBackground(Color.darkGray);
     exit.setForeground(Color.white);
     //go look for other colors to go with the monochrome stuff
     reference.setBackground(new Color(105,105,105));
     ruler.setBackground(new Color(147,147,147));
     Conversion.setBackground(new Color(53,53,53));
     Conversion.setForeground(Color.white);

     setLocation((WindowSize.width)/2, WindowSize.height);
     //check if the device can check the stuff

     //actionlisteners
     ruler.addActionListener((ActionEvent e) -> {this.Ruler();});
     reference.addActionListener((ActionEvent e) -> {this.reference();});
     //manages the point selections
     point.addActionListener((ActionEvent e) -> {this.point();});
     
     //Manages the exit button to quit the program
     exit.addActionListener((ActionEvent e) -> {System.exit(0);});
   
     Conversion.addActionListener((ActionEvent e)-> {this.convert();});

     //adds the elements to the frame
     add(point);
     add(ruler);
     add(reference);
     add(Conversion);
     add(exit);

     setVisible(true);
     }

     public void Ruler()
     {PixelRuler PRule = new PixelRuler();}
     public void reference()
     {PixelRef Pr = new PixelRef();}
     public void convert()
     {PixelConverter PC = new PixelConverter();}
     public void point()
     {PixelTwoPoint ptp = new PixelTwoPoint();}
     public static void main(String args[])
     {
        PixelMeasureGUI pm = new PixelMeasureGUI();
     }

}
