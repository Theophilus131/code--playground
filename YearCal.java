
public class YearCal{

 
public static void main(String [] args){

	calculateYearOfBirth(7);

	}


public static void calculateYearOfBirth(int age){


	int currentYear = 2025;

	int yearOfBirth = currentYear - age;
   

System.out.println("My birth year is :" + yearOfBirth);
}


}