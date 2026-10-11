import javax.swing.*;
//Make sure to either round to 2 decimal points, or just cast it to an int, and let the user know that its an approximation
public class PixelConverter extends JFrame
{
     private double ConvertInch = 0.0104;
     private double ConvertCM = 0.026;
     private double ConvertMM = 0.26; 
     public PixelConverter()
     {
          //prompts the user for what theyd like to convert to.
          Object[] ConvertValues = {"Inches","Centimeters","Milimeters"};
          Object ConversionUnit = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE, null, ConvertValues, ConvertValues[0]);

          //prompts user for size in px
          String PixelLength = JOptionPane.showInputDialog(null, "What is the value you want converted?");
          //make sure to put this in a try-catch to see if its actually an int. otherwise, use recusrsion to start the whole thing over again
          int ConvertVal = 0;
          try
          {
               ConvertVal = Integer.parseInt(PixelLength);
          }
          catch(Exception e)
          {
               JOptionPane.showMessageDialog(null, "Please enter an integer value.");
               System.exit(0);
          }
          //converting the actual values
          if (ConversionUnit.equals("Inches"))
          {
               double InchVal = ConvertVal / ConvertInch; 
               JOptionPane.showMessageDialog(null, (PixelLength + " in Inches would be " + (int)InchVal));

          }
          else if(ConversionUnit.equals("Centimeters"))
          {
               double CMVal = ConvertVal / ConvertCM;
               JOptionPane.showMessageDialog(null, (PixelLength + " in Centimeters would be " + (int)CMVal));
          }
          else
          {
               double MMVal = ConvertVal / ConvertMM;
               JOptionPane.showMessageDialog(null, (PixelLength + " in Millimeters would be " + (int)MMVal));
          }
          
     }

}