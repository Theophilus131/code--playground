public class SquareFunction{

public static void main(String[] args){

//System.out.println("multiple function calling: ");
printSquare();

	}

public static int square(int x){

return x * x;

	}

public static void printSquare(){

int result = square(4);
System.out.println("result:" + result);

	}

}