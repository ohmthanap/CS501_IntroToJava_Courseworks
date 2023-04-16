/* Thanapoom Phatthanaphan
 * This is a program to judge an even number, using while loop and if-else statement.
 */

import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	     int number;
	     String entry, message;
	     final int QUIT = 999;
	     System.out.print("Enter an even number or " + QUIT + " to quit: "); 
	     entry = input.nextLine();
	     number =  Integer.parseInt(entry);      
	     while(number != QUIT)
	     { 
	        if(number % 2 == 0)
	           message = "Good job!";
	        else
	           message = number + " is not an even number";
	        System.out.print(message);
	        System.out.print("Enter an even number or " + QUIT + " to quit: "); 
	        entry = input.nextLine();
	        number =  Integer.parseInt(entry);  
	     }   

	}

}
