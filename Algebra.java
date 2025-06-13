import java.util.Scanner;
public class Algebra{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a, b,  c : ");
double a = input.nextDouble();
double b = input.nextDouble();
double c = input.nextDouble();

double r1 = (- b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

double r2 = (- b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

//System.out.printf("the equations has two roots %f%f%n: ", r1 , r2);



if(Math.pow(b,b) - (4 * a * c) > 0){

System.out.printf("the equations has two roots %f %f%n: ", r1 , r2);
}

else if(Math.pow(b,b) - (4 * a * c) == 0){

System.out.printf("the equations has one roots %f%n: ", r1 );
}
else {System.out.printf("the equations has no roots: ");}









	}





}