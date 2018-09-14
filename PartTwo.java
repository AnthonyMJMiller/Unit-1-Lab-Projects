package labOne;

import java.time.Period;
import java.time.LocalDate;
import java.util.Scanner;

//
public class PartTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter start(first) date in yyyy-MM-dd format :");
		
		String DateOne = sc.next();
		LocalDate DOne = LocalDate.parse(DateOne);
		
		System.out.println("Enter end(second) date in yyyy-MM-dd format :");
		
		String DateTwo = sc.next();
		LocalDate DTwo = LocalDate.parse(DateTwo);
		
		Period difference = DOne.until(DTwo);
		
		int Days = difference.getDays();
		int Months = difference.getMonths();
		int Years = difference.getYears();
		
		System.out.println("There is " + Days+" days, "+Months+" months, "+"and "+Years+" years between "+DOne+" and "+DTwo+".");
		
		sc.close();
	}
	

}
