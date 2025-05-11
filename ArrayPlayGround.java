
 public class ArrayPlayGround{
 public static void main(String [] args){

 double [] myList = new double [10];
double max = myList[0];

 java.util.Scanner input = new java.util.Scanner(System.in);

System.out.print("Enter" + myList.length + "values:");
for (int i = 0; i< myList.length; i++)
  myList[i] = input.nextDouble();

for(int i= 1; i<myList.length; i++){
if (myList[i] > max) max = myList[i];

	}

System.out.printf("largest is %d%n ", max );
 

	








	
	
	}





}