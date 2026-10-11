import javax.swing.*;
//This class handles the conversion between px and the selected unit
public class PixelConverter extends JFrame
{
     // Conversion rates, for later
     private double ConvertInch = 0.0104;
     private double ConvertCM = 0.026;
     private double ConvertMM = 0.26; 
     public PixelConverter()
     {
          //prompts the user for what they'd like to convert to.
          Object[] ConvertValues = {"Inches","Centimeters","Milimeters"};
          Object ConversionUnit = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE, null, ConvertValues, ConvertValues[0]);

          //prompts user for size in px
          String PixelLength = JOptionPane.showInputDialog(null, "What is the value you want converted?");
          int ConvertVal = 0;
          //ensures that value is an integer, closes program otherwise
          try
          {
               ConvertVal = Integer.parseInt(PixelLength);
          }
          catch(Exception e)
          {
               JOptionPane.showMessageDialog(null, "Please enter an integer value.");
               System.exit(0);
          }

          //converting the actual values, and showing results to user.
          if (ConversionUnit.equals("Inches"))
          {
               double InchVal = ConvertVal / ConvertInch; 
               JOptionPane.showMessageDialog(null, (PixelLength + " in Inches would be roughly" + (int)InchVal));

          }
          else if(ConversionUnit.equals("Centimeters"))
          {
               double CMVal = ConvertVal / ConvertCM;
               JOptionPane.showMessageDialog(null, (PixelLength + " in Centimeters would be roughly " + (int)CMVal));
          }
          else
          {
               double MMVal = ConvertVal / ConvertMM;
               JOptionPane.showMessageDialog(null, (PixelLength + " in Millimeters would be roughly" + (int)MMVal));
          }
          
     }

}