import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;

public class PixelRuler 
{
     //Gets dimensions of screen
     private final Dimension WindowSize = Toolkit.getDefaultToolkit().getScreenSize();
     @SuppressWarnings("OverridableMethodCallInConstructor")
     public PixelRuler()
     {
     // choices for JOptionPrompt
     Object[] RulerChoice = {"Vertical", "Horizontal"};
     Object RulerPosition = JOptionPane.showInputDialog(null, "Choose one", "Ruler Orientation", JOptionPane.INFORMATION_MESSAGE, null, RulerChoice, RulerChoice[0]);
     // if else to see what user chose
     if (RulerPosition == RulerChoice[0])
     {
          this.verticalRuler();
     }
     else
     {
          this.horizontalRuler();
     }
     }
     //method for making horizontal ruler
     int i = 0;
     public void horizontalRuler()
          {
               JFrame HoriRuler = new JFrame();
               //Housekeeping
               HoriRuler.setLayout(new FlowLayout());
               HoriRuler.setSize(WindowSize.width,250);
               HoriRuler.setUndecorated(true);
               //mess with the line below to change the opacity 
               HoriRuler.setOpacity(.5f);
               //arraylist that creates a new jlabel every 100 px
               ArrayList<JLabel> HoriMarks = new ArrayList<>();
               //counter var for while loop
               i = 0;
               //while loop that makes new JLabel every 100 px, appends it to the arraylist, and adds it to jframe as well
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
     // same as horizontal ruler, see above for comments
     public void verticalRuler()
     {
     JFrame VertiRuler = new JFrame();
     VertiRuler.setLayout(new FlowLayout());
     //make sure that this takes the height of the users screen
     VertiRuler.setUndecorated(true); 
     VertiRuler.setOpacity(.5f);
     VertiRuler.setSize(250,WindowSize.height);
     //this is meant to handle the lines for the ruler. make sure that they get placed evenly, and show them as markings with a factor of 10. (so small marks for every 10 px, large for every 100)
     ArrayList<JLabel> VertiMarks = new ArrayList<>();
     i = 0;
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