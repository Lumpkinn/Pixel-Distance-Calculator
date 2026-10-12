//This class holds the Base of the GUI elements in the project. This will be used to let the user pick which tool they'd like to use.
import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
public class PixelMeasureGUI extends JWindow
{

   //get the window size (important for different aspect ratios)
    Dimension WindowSize = Toolkit.getDefaultToolkit().getScreenSize();
    //buttons that will direct to the seperate tools
    JButton reference = new JButton("Reference");
    JButton point = new JButton("Two Point");
    JButton exit = new JButton("Quit");
    JButton ruler = new JButton("Ruler");
    JButton Conversion = new JButton("Convert");
    //Constructor
    public PixelMeasureGUI()
    {
     //housekeeping
     setLayout(new FlowLayout());
     setLocation((WindowSize.width)/2, WindowSize.height);
     setSize(480,40);
     this.getRootPane().setBorder(BorderFactory.createLineBorder(Color.black));
     //colors!
     setBackground(Color.lightGray);
     point.setBackground(Color.gray);
     exit.setBackground(Color.darkGray);
     reference.setBackground(new Color(105,105,105));
     ruler.setBackground(new Color(147,147,147));
     Conversion.setBackground(new Color(53,53,53));
     //text colors!
     Conversion.setForeground(Color.white);
     exit.setForeground(Color.white);

     //action listeners
     ruler.addActionListener((ActionEvent e) -> {this.Ruler();});
     reference.addActionListener((ActionEvent e) -> {this.reference();});
     point.addActionListener((ActionEvent e) -> {this.point();});
     exit.addActionListener((ActionEvent e) -> {System.exit(0);});
     Conversion.addActionListener((ActionEvent e)-> {this.convert();});

     //adds the elements to the JFrame.
     add(point);
     add(ruler);
     add(reference);
     add(Conversion);
     add(exit);

     setVisible(true);
     }
     // methods for ActionListeners.
     public void Ruler()
     {@SuppressWarnings("unused")
     PixelRuler PRule = new PixelRuler();}
     public void reference()
     {@SuppressWarnings("unused")
     PixelRef Pr = new PixelRef();}
     public void convert()
     {@SuppressWarnings("unused")
     PixelConverter PC = new PixelConverter();}
     public void point()
     {@SuppressWarnings("unused")
     PixelTwoPoint ptp = new PixelTwoPoint();}
     public static void main(String[] args) {
         @SuppressWarnings("unused")
         PixelMeasureGUI mainInstance = new PixelMeasureGUI();
     }

}
