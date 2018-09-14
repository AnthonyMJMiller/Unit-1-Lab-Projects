package labOne;
import java.util.Scanner;

// Lab 1 - Part 1 by Anthony Miller
public class PartOne {

	public static void main(String[] args) {
		// Scanner is needed for user input.
		Scanner Num = new Scanner(System.in);
		// Called the two integers that would be needed for user below.
		int FirstNo;
		int SecondNo;
		
		
		/* Requesting that user enters in a positive number for program to execute equation properly. */
		System.out.println("Enter in a positive number (Must be exactly three digits):");
		FirstNo = Num.nextInt();
		
			/* Originally was using the FirstNo/10 with the called int variable count with count++ but I found that the && operator was more simple. */
			if (FirstNo>100 && FirstNo<999) { 
				System.out.println("Enter in a second positive number (Must also be exactly three digits):");
				/* If first number meets requirements, program requests user to input the next number listed below. */
			SecondNo = Num.nextInt();
				// If second number meets requirements then program executes equation.
				if (SecondNo>100 && SecondNo<999) {
				mathEquations (FirstNo, SecondNo);
				}
				else {
					System.out.println("Error: Number has to be exactly three digits. Please enter in a three digit number:");
				}
			}
			else {
				System.out.println("Error: Number has to be exactly three digits. Please enter in a three digit number:");
				}
			
		Num.close();
		}
		
	
	/* This is the equation that the program is executing to add each digit (ones, tens, hundreds) of both numbers and return if they sum to the same total or not. */
	public static void mathEquations(int firstNo, int secondNo) {
		{
			// Called int to compare and add each digit from one number to another.
		    int compareTo = (firstNo % 10) + (secondNo % 10);
		    
		    firstNo /= 10;
		    secondNo /= 10;  
		    
		    // Called one here as well to use if statement for equation.
		    int temp = (firstNo % 10) + (secondNo % 10);
		    // Used while loop to read off each digit for equation.
		    while(firstNo > 0 && secondNo > 0) {
		    	
		        firstNo /= 10;
		        secondNo /= 10;
		    }
		    	/* If statement that checks if each number equates to each other and gives a true or false statement depending on the answer. */
		        if (compareTo != temp) 
		        	System.out.println("The corresponding digits of each of the two numbers do not sum to the same total.");
		        
		        else 
		        	System.out.println("The corresponding digits of each of the two numbers sum to the same total.");
		        }

		      }
		    
		
		}
	

	



