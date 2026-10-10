import java.awt.*;
import javax.*;

public class PixelRef extends JFrame
{
     int length = JOptionPane.showInputDialog(this, "How long do you want your reference window to be? ");
     int height = JOptionPane.showInputDialog(this, "How tall do you want your reference window to be? ");
     setSize(length, height);
     setVisible(true);
     
}