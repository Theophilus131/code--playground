//Write a Java program to create an array of 5 integers, accept values from the user, and print them in reverse order.

import java.util.Arrays;
public class ReserveArray{

public static void main(String [] args){

int [] integers = {1,2,3,4,5};

int [] reversed = new int [integers.length];

for(int i = 0; i < integers.length; i++){

reversed[i] = integers[integers.length-1-i];


	}

System.out.println(Arrays.toString(reversed));


}



	}