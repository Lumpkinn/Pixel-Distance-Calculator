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
     //pass the coords. Idrk what class would fit, and its not like i can do research rn, so make sure to replace l8r
     static double distance = 0.0;
     public static void DistancePopup(Point point1, Point point2)
     {
          // make sure to calculate the distance here btw
          
          //again, i know that this is causing an error, thats for future you to fix
          JOptionPane.showMessageDialog(this, ("The distance between the two points is" + distance));
     }
}

class CursorListener implements MouseListener
{    private int numClick = 0;

     @Override
     public void mousePressed(MouseEvent arg0)
     {
          PointerInfo Cursor = MouseInfo.getPointerInfo();
          Point CursorInfo = Cursor.getLocation();
          
          //be careful, make sure that this can actually convert the distance to pixels
          double CursorX = CursorInfo.getX();
          double CursorY = CursorInfo.getY(); 
          //make sure to take the input and converting it to a point (Tl;Dr, get coords). 
          
          if (numClick > 1)
          {
               numClick = 0; 
          }
          else
          {
               //calculate distance, run static method from twopoint that'll make a popup, and then use popup to display the distance between the two points.
               double[] pointinfo = new double[2];
               pointinfo.append(CursorX);
               pointinfo.append(CursorY);
          }
          
     }
     @Override
     public void mouseEntered(MouseEvent arg0) { }

     @Override
     public void mouseExited(MouseEvent arg0) { }

     @Override
     public void mouseReleased(MouseEvent arg0) { }
     @Override
     public void mouseClicked(MouseEvent e) {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
     }

}