//Write a method that takes an array and returns a new array with only the even numbers.

import java.util.Arrays;
public class EvenNumber{

public static int [] evenArray(int [] number){

int [] even = new int [number.length];

for(int i = 0; i < number.length; i++){
	
	if(number[i] % 2 == 0){
	number[i] = even[number.length];
	}
}
	return even;
	}

	public static void main(String [] args){

	int [] integers = {1,2,3,4,5,6,7,8,9,10};

	System.out.println(Arrays.toString(EvenNumber.evenArray(integers)));


	}


}