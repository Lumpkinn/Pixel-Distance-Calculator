import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Point2D;
import java.util.*;
import javax.swing.*;

public class PixelTwoPoint extends JFrame
{
     private final JButton exit = new JButton();
     //gets the size of the window
     Dimension WindowSize = Toolkit.getDefaultToolkit().getScreenSize();
     public PixelTwoPoint()
     {
          exit.addActionListener((ActionEvent e) -> {setVisible(false);});
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
}
class CursorListener implements MouseListener
{    private int numClick = 0;
     private double distanceBetweenPoints;
     @SuppressWarnings("FieldMayBeFinal")
     private ArrayList<Point>  pointinfo = new ArrayList<>();
     private static JOptionPane test = new JOptionPane();
     @Override
     public void mouseClicked(MouseEvent arg0)
     {
          
          Point Cursor = MouseInfo.getPointerInfo().getLocation();
          
          pointinfo.add(Cursor);
           
          //be careful, make sure that this can actually convert the distance to pixels 
          //make sure to take the input and converting it to a point (Tl;Dr, get coords). 
          
          if (numClick > 1)
          {
               numClick = 0; 
          }
          else
          {
               if (pointinfo.size() != 1)
               {
               //distance is the sqrt of the sum of the differemces on the x and y plane
               //calc
               distanceBetweenPoints = (Point2D.distance((pointinfo.get(0).x), pointinfo.get(0).y, pointinfo.get(1).x, pointinfo.get(1).y)); 
               
               test.setBackground(Color.lightGray);
               test.setForeground(Color.DARK_GRAY);
               test.showMessageDialog(null, ("The distance between the two points is: " + (int)distanceBetweenPoints + " Pixels"));
               pointinfo.clear();
               System.exit(0);
          }
          }     
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