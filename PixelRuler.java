import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import java.util.ArrayList;
//For the markings, maybe i could make an array of JLabels that will mark off every 100 px?

//make it so that the ruler dissapears when you click on it.

public class PixelRuler extends JFrame
{
     private Dimension WindowSize = Toolkit.getDefaultToolkit().getScreenSize();
     public PixelRuler()
     {
     Object[] RulerChoice = {"Vertical", "Horizontal"};
     Object RulerPosition = JOptionPane.showInputDialog(null, "Choose one", "Ruler Orientation", JOptionPane.INFORMATION_MESSAGE, null, RulerChoice, RulerChoice[0]);
     
     if (RulerPosition == RulerChoice[0])
     {
          this.verticalRuler();
     }
     else
     {
          this.horizontalRuler();
     }
     pack();
     setVisible(true);
     }

     public void horizontalRuler()
          {
               JFrame HoriRuler = new JFrame();
               //make sure that this takes the Length of the users screen
               HoriRuler.setLayout(new FlowLayout());
               HoriRuler.setSize(WindowSize.width,250);
               HoriRuler.setUndecorated(true);
               //mess with the line below to change the opacity 
               HoriRuler.setOpacity(.5f);
               //arraylist that creates a new jlabel every 100 px, appends it to the ruler, and adds it as well
               
               ArrayList<JLabel> HoriMarks = new ArrayList<JLabel>();

               int i = 0;
               while (i < (int) WindowSize.width)
                    
                    {
                         JLabel marking = new JLabel(Integer.toString(i));
                         HoriMarks.add(marking);
                         marking.setLocation(250, i);
                         marking.setBorder(new EmptyBorder(100,0,100,100));

                         i+=100;
                    }

               for(int j = 0; j < HoriMarks.size(); j++)
               {
                    HoriRuler.add(HoriMarks.get(j));
               }
               HoriRuler.setVisible(true);
          }

     public void verticalRuler()
     {
     JFrame VertiRuler = new JFrame();
     VertiRuler.setLayout(new FlowLayout());
     //make sure that this takes the height of the users screen
     VertiRuler.setUndecorated(true); 
     VertiRuler.setOpacity(.5f);
     VertiRuler.setSize(250,WindowSize.height);
     //this is meant to handle the lines for the ruler. make sure that they get placed evenly, and show them as markings with a factor of 10. (so small marks for every 10 px, large for every 100)
     ArrayList<JLabel> VertiMarks = new ArrayList<JLabel>();
     int i = 0;
     while (i < (int) WindowSize.height)
          {
               JLabel marking = new JLabel(Integer.toString(i));
               VertiMarks.add(marking);
               marking.setLocation(250,i);
               marking.setBorder(new EmptyBorder(0,100,100,100));
               i+=100;
          }
            
     for(int j = 0; j < VertiMarks.size(); j++)
     {
          VertiRuler.add(VertiMarks.get(j));
     }
     VertiRuler.setVisible(true);
     
     }
     
}