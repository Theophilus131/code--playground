//Create an array of 10 integers and calculate the sum and average of all elements.

public class AverageSum{
public static void main(String [] args){

int [] numbers = {1,2,3,4,5,6,7,8,9,10};
int total = 0;
double average = 0;

for(int i = 0; i < numbers.length; i++){

total += numbers[i];

average = total / numbers[i];

}

System.out.println("sum of the element is: " + total);
System.out.println("average is: " + average);

	}


}