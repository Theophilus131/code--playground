//Write a Java program to check if a year is a leap year.

import java.util.Scanner;
public class LeapYearChecker{
public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter the Year you want to check");
	int year = input.nextInt();

  	if( year < 1000 || year > 10000)
   	 System.out.println("Enter a valid year: ");

   	if(year % 400 == 0 )
      	System.out.println("Year entered is a leap year");
 
		else if(year % 100 == 0)
		System.out.println("year entered is not a leap year");

		else if (year % 4 == 0)
          	System.out.println("year entered is a leap year");

		else{
 		System.out.println("year entered is not a leap year");}


}
	}