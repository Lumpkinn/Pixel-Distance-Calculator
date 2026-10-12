//This class handles the conversion between px and the selected unit
import javax.swing.*;
public class PixelConverter
{
     // Conversion rates, for later
     private double ConvertInch = 0.0104;
     private double ConvertCM = 0.026;
     private double ConvertMM = 0.26; 

     public PixelConverter()
     {      
          Object[] ConversionType = {"Units to Pixels", "Pixels to Units"};
          Object ConversionChoice = JOptionPane.showInputDialog(null, "Conversion type" ,"What kind of conversion do you want to make?", JOptionPane.INFORMATION_MESSAGE,null, ConversionType, ConversionType[0]);
          //prompts the user for what they'd like to convert to.
          
          Object[] ConvertValues = {"Inches","Centimeters","Milimeters"};
          Object ConversionUnit = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE, null, ConvertValues, ConvertValues[0]);


          //prompts user for size in px
          String PixelLength;
          PixelLength = JOptionPane.showInputDialog(null, "What is the value you want converted?");
          int ConvertVal = 0;
          //ensures that value is an integer, closes program otherwise
          try
          {
               ConvertVal = Integer.parseInt(PixelLength);
          }
          catch(NumberFormatException e)
          {
               JOptionPane.showMessageDialog(null, "Please enter an integer value.");
               System.exit(0);
          }
          if (ConversionChoice.equals("Pixels to Units"))
          {
               //converting the actual values, and showing results to user.
               if (ConversionUnit.equals("Inches"))
               {
                    double InchVal = ConvertVal / ConvertInch; 
                    JOptionPane.showMessageDialog(null, (PixelLength + " in inches would be roughly" + (int)InchVal));

               }
               else if(ConversionUnit.equals("Centimeters"))
               {
                    double CMVal = ConvertVal / ConvertCM;
                    JOptionPane.showMessageDialog(null, (PixelLength + " in centimeters would be roughly " + (int)CMVal));
               }
               else
               {
                    double MMVal = ConvertVal / ConvertMM;
                    JOptionPane.showMessageDialog(null, (PixelLength + " in millimeters would be roughly" + (int)MMVal));
               }
          }
          else
          {

               //converting the actual values, and showing results to user.
               if (ConversionUnit.equals("Inches"))
               {
                    double InchVal = ConvertVal * ConvertInch; 
                    JOptionPane.showMessageDialog(null, (PixelLength + " in pixels would be roughly" + (int)InchVal));

               }
               else if(ConversionUnit.equals("Centimeters"))
               {
                    double CMVal = ConvertVal * ConvertCM;
                    JOptionPane.showMessageDialog(null, (PixelLength + " in pixels would be roughly " + (int)CMVal));
               }
               else
               {
                    double MMVal = ConvertVal * ConvertMM;
                    JOptionPane.showMessageDialog(null, (PixelLength + " in pixels would be roughly" + (int)MMVal));
               }
          }     
     }

}