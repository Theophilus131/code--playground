import java.util.ArrayList;
public class NumberGenerator{

public static ArrayList<Integer> generateRandomList(){

	ArrayList<Integer> numbers = new ArrayList<>();

	for(int index = 0; index < 10; index++){
	int randomNum = (int)(Math.random() * 50) + 1;
	numbers.add(randomNum);

}

return numbers;
}



public static void main(String [] args){

	ArrayList<Integer> randomNumbers = generateRandomList();

	System.out.println("Random numbers :" + randomNumbers);

	}


} 