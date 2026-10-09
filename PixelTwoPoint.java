import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
public class PixelTwoPoint extends JFrame
{
     //gets the size of the window
     Dimension WindowSize = Toolkit.getDefaultToolkit().getScreenSize();
     public PixelTwoPoint()
     {
          //full screen see-through window
          setUndecorated(true);
          //mess with the line below to change the opacity 
          setOpacity(.5f);
          
          setSize(WindowSize.width, WindowSize.height);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          CursorListener CursorPos = new CursorListener();
          addMouseListener(CursorPos);
          setVisible(true);

     }
     //pass the coords. Idrk what class would fit, and its not like i can do research rn, so make sure to replace l8r
     
     public static void main(String args[])
     {
          // make sure to calculate the distance here btw
          PixelTwoPoint ptp = new PixelTwoPoint();
          
          //again, i know that this is causing an error, thats for future you to fix
     }
}

class CursorListener implements MouseListener
{    private int numClick = 0;

     @Override
     public void mouseClicked(MouseEvent arg0)
     {
          ArrayList<Double>  pointinfo = new ArrayList<>();
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
               
               pointinfo.add(CursorX);
               pointinfo.add(CursorY);
               if (pointinfo.size() >= 3)
               {
               //distance is the sqrt of the sum of the differemces on the x and y plane
               //calc
               double distanceBetweenPoints = Math.sqrt(pointinfo.get(0) - pointinfo.get(2)) + (pointinfo.get(1) - pointinfo.get(3)); 
               
               JOptionPane.showMessageDialog(null, ("The distance between the two points is" + distanceBetweenPoints));
               
               }
          }
     System.out.print("Method had been ran. ArrayList values are: x = " + pointinfo.get(0) +" y = " +pointinfo.get(1));
     }
          
     
     @Override
     public void mouseEntered(MouseEvent arg0) { }

     @Override
     public void mouseExited(MouseEvent arg0) { }

     @Override
     public void mouseReleased(MouseEvent arg0) { }
     @Override
     public void mousePressed(MouseEvent e) { }
}