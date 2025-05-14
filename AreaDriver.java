import java.util.Scanner;

public class AreaDriver{
public static void main(String [] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the number of sides the polygon has: ");
  int polygonSide = input.nextInt();

System.out.println("Enter the side: ");
   double side = input.nextDouble();


System.out.println("The area of the polygon is: " + AreaOfPolygon.area(polygonSide, side));





	}


}