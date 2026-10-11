import javax.swing.*;

public class PixelRef extends JFrame
{
     public PixelRef()
     {
          setUndecorated(true);
          setResizable(false);
          setLocationRelativeTo(null);
          String length = JOptionPane.showInputDialog(this, "How long do you want your reference window to be? ");
          String height = JOptionPane.showInputDialog(this, "How tall do you want your reference window to be? ");
          try
          {
               setSize((Integer.parseInt(length)), (Integer.parseInt(height)));
          }
          catch(Exception e)
          {
               JOptionPane.showMessageDialog(this, "Please enter a number");
          }
          setVisible(true);
          
          try
          {
               Thread.sleep(5000);
          }
          catch (Exception e)
          {System.out.println("Error");}
          System.exit(0);
     }
}