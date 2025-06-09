
class AddingArray{

public static void main(String [] args){

	int input [] = {1 ,2,3, 4,5,6,7};

	change(input);
	for(int y: input)	

	System.out.println(y);

}

	public static void change(int x [] ){

	for(int counter = 0; counter < x.length; counter++){

		x[counter] += 5;

		}

	}

}