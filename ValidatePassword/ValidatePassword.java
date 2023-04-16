/* Thanapoom Phatthanaphan
 * This is a program to create a password as specified rules. The program will validate the password and
 * displays that the password is valid or not. If not, the program will provide reasons.
 */

import java.util.*;
public class ValidatePassword
{
  public static void main(String[] args)
  {
     String aString;
     int stringLength;
     final int NUM = 1;
     int upperCount;
     int lowerCount;
     int digitCount;
     int letterCount;
     final int minLetter = 8;
     Scanner in = new Scanner(System.in);
     int numSpaces;
     boolean repeat = true;
      
  do 
    {
      upperCount = 0;
      lowerCount = 0;
      digitCount = 0;
      letterCount = 0;
      numSpaces = 0;
          
     System.out.print("Enter a string >> ");
     aString = in.nextLine();
     stringLength = aString.length();

     for(int i = 0; i < stringLength; i++)
     {
        char ch = aString.charAt(i);
        if(Character.isUpperCase(ch))
        	upperCount++;
        else if(Character.isLowerCase(ch))
            lowerCount++;
        else if (Character.isSpaceChar(ch))
        	numSpaces++;
        else if(Character.isDigit(ch))
        	digitCount++;
        else
        	numSpaces++;
        letterCount++;
     }
     if(upperCount >= NUM && lowerCount >= NUM && digitCount >= NUM && letterCount >= minLetter && numSpaces == 0)
     {
        System.out.println("Valid password"); 
        repeat = false;
     } else
     {
        System.out.println("The password is invalid because");
        if(upperCount < NUM)
        	System.out.println("Your password doesn't contain an uppercase letter (Must contain at least 1 uppercase letter)");
        if(lowerCount < NUM)
        	System.out.println("Your password doesn't contain a lowercase letter (Must contain at least 1 lowercase letter)");
        if(digitCount < NUM)
        	System.out.println("Your password doesn't contain a digit (Must contain at least 1 digit)");
        if(letterCount < minLetter)
        	System.out.println("Your password is too short (Must contain at least 8 letters)");
        if(numSpaces > 0)
        	System.out.println("Your password contains a space");
        
      }
     } while (repeat == true);
   } 
}
