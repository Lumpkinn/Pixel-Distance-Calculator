import javax.swing.*;

public class PixelRef extends JFrame
{
     public PixelRef()
     {
          //Housekeeping (all of this is for the reference window itself)
          setUndecorated(true);
          setResizable(false);
          setLocationRelativeTo(null);
          //gets the aspect ratio
          String length = JOptionPane.showInputDialog(null, "How long do you want your reference window to be? ");
          String height = JOptionPane.showInputDialog(null, "How tall do you want your reference window to be? ");
          
          //tries to set the aspect ratio. If the inputted value is not an int, informs user, and then program closes
          try
          {
               setSize((Integer.parseInt(length)), (Integer.parseInt(height)));
          }
          catch(NumberFormatException e)
          {
               JOptionPane.showMessageDialog(null, "Please enter a valid input type.");
               System.exit(0);
          }

          //lets user see window, closes after 5 seconds
          setVisible(true);
          //sleep window for 5 sec
          try
          {
               Thread.sleep(5000);
          }
          catch (InterruptedException e)
          {
               System.out.println("Error");
          }
          System.exit(0);
     }
}