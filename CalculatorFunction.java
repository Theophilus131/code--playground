public class CalculatorFunction{

public static void main(String [] args){

	int a = 10, b = 5;
int result = calculate(a, b);

System.out.println("Result: " + result);




}

public static int calculate(int x, int y){

int sum = add(x, y);

int product = multiply(x, y);

return sum + product;
	}

public static int add(int x, int y){

return x + y;
	}

public static int multiply(int x, int y){
	return x * y;


	}

}