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
          setSize((Integer.parseInt(length)), (Integer.parseInt(height)));
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