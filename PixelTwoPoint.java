import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.*;

public class PixelTwoPoint extends JFrame
{
     //Gets the size of the window.
     Dimension WindowSize = Toolkit.getDefaultToolkit().getScreenSize();
     
     public PixelTwoPoint()
     {
          //general housekeeping
          //Creates a full screen translucent window
          setUndecorated(true);
          //mess with the line below to change the opacity 
          setOpacity(.5f);
          setSize(WindowSize.width, WindowSize.height);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          //This allows for the program to checks for clicks, and store their position.
          CursorListener CursorPos = new CursorListener();
          addMouseListener(CursorPos);
          setVisible(true);

     }
}
//Class for cursor listener. All the stuff in the mouseClicked function is run whenever the user clicks.
class CursorListener implements MouseListener
{    
     
     //Instance variables that check how many times the user has clicked, so we can know when they've clicked on two spots. Also makes a variable for knowing the distance between two points.
     private int numClick = 0;
     private double distanceBetweenPoints;
     @SuppressWarnings("FieldMayBeFinal")
     //arraylist holding info for the points. (I could possibly make this a normal array, but id rather avoid the possiblility of OOB errors. if I need to optimize though, ill do it.)
     private ArrayList<Point>  pointinfo = new ArrayList<>();
     
     @Override
     public void mouseClicked(MouseEvent arg0)
     {
          //Gets the position of the mouse.
          Point Cursor = MouseInfo.getPointerInfo().getLocation();
          //Adds the position to the pointinfo arraylist
          pointinfo.add(Cursor);
          
          if (numClick > 1)
          {
               numClick = 0; 
               try
               {
                    Thread.sleep(5000);
               }
               catch(InterruptedException e)
               {
                    System.out.print("An error has occured. Closing program");
                    System.exit(0);
               }
          }
          else
          {
               if (pointinfo.size() != 1)
               {
               //distance is the sqrt of the sum of the differemces on the x and y plane
               //calculating the distance
               distanceBetweenPoints = (Point2D.distance((pointinfo.get(0).x), pointinfo.get(0).y, pointinfo.get(1).x, pointinfo.get(1).y)); 
               //displaying the distance
               JOptionPane PointInfo = new JOptionPane(("The distance between the two points is: " + (int)distanceBetweenPoints + " Pixels"), JOptionPane.INFORMATION_MESSAGE);
               JDialog PointDialog = PointInfo.createDialog("Distance Between Points");
               //all of these specifically ensure that the dialog box stays on top. If this wasn't the case, it'd be 10 times harder to close out the program 
               PointDialog.setAlwaysOnTop(true);
               PointDialog.setModal(true);
               PointDialog.setVisible(true);
               pointinfo.clear();
               System.exit(0);
          }
          }     
     }
     //all of this is useless currently, pay it no mind
     @Override
     public void mouseEntered(MouseEvent arg0) { }

     @Override
     public void mouseExited(MouseEvent arg0) { }

     @Override
     public void mouseReleased(MouseEvent arg0) { }
     @Override
     public void mousePressed(MouseEvent arg0) { }

}