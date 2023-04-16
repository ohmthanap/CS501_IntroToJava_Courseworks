/* Thanapoom Phatthanaphan
 * This is a program to display three letters acronym, building from 3 words that user input.
 */

import java.util.Scanner;
public class ThreeLetterAcronym
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String tla = "", entry;
      int stringLength;
      final int MAX = 3;
      char c;
      System.out.print("Please enter three words, using a space to separate each word: ");
      entry = input.nextLine();
      stringLength = entry.length();
      tla += Character.toUpperCase(entry.charAt(0));
	  for(int i = 1; i < stringLength; i++)
	  {
		  if((tla.length() < MAX) && (entry.charAt(i) == ' '))
            {
               i++;
               c = entry.charAt(i);
               c = Character.toUpperCase(c);
               tla += c;
            }
        }
      System.out.print( "Original phrase was " +
         entry + "\nThree letter acronym is " + tla);
      }
   }
