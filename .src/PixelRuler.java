import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//I got no idea how im gonna do this tbh :/
public class PixelRuler extends JFrame
{
     //Make four options for the rule l8r
     //for now, just make it so theres one ruler, cause you need to figure out how to rotate windows
     public PixelRuler()
     {
     JButton HorizontalButton = new JButton();
     JButton VerticalButton = new JButton();

     //Basic formatting/housekeeping
     setLayout(new FlowLayout());
     
     add(HorizontalButton);
     add(VerticalButton);
     HorizontalButton.addActionListener((ActionEvent e) -> {this.horizontalRuler();});
     VerticalButton.addActionListener((ActionEvent e) -> {this.horizontalRuler();});


     pack();
     setVisible(true);
     }

     public void horizontalRuler()
     {
     System.out.print("yo");
     }

     public void verticalRuler()
     {System.out.println("gurt");}
     
}