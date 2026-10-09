import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PixelTwoPoint extends JFrame
{
     Dimension WindowSize = Toolkit.getDefaultToolkit().getScreenSize();
     public PixelTwoPoint()
     {
          //housekeeping
          setDefaultLookAndFeelDecorated(true);

          //full screen see-through window

          //mess with the line below to change the opacity 
          setOpacity(1f);
          
          setSize(WindowSize.width, WindowSize.height);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          CursorListener CursorPos = new CursorListener();
          addMouseListener(CursorPos);
          

     }
}
class CursorListener implements MouseListener
{ 
     @Override
     public void mousePressed(MouseEvent arg0)
     {
          PointerInfo Cursor = MouseInfo.getPointerInfo();
          Point CursorInfo = Cursor.getLocation();
          
          //be careful, make sure that this can actually convert the distance to pixels
          double CursorX = CursorInfo.getX();
          double CursorY = CursorInfo.getY(); 
          
          
     }
     @Override
     public void mouseEntered(MouseEvent arg0) { }

     @Override
     public void mouseExited(MouseEvent arg0) { }

     @Override
     public void mouseReleased(MouseEvent arg0) { }

}